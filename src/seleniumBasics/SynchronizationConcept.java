package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	// Synchronization -> synch between application loading and automation execution
	
			// Types of synchronization:
				// 1. Static wait -> pause in execution, Thread.sleep(5000);
			
				// 2. Dynamic wait -> pause execution for defined amount of time until element is found, if found continue execution
						// a. Implicit wait: -> global wait, defined once applicable for all elements where action is going to be performed -> implicitlyWait()
						// b. Explicit wait: -> defined for a specific element | Expected conditions can be defined | default polling (500 milliseconds) -> WebDriverWait class
								
								// Fluent wait: -> polling/frequency of search can be adjusted -> FluentWait class
		// E.g
		//Implicit wait -> 15 seconds -> default frequency of search every 5 seconds
		//Explicit wait -> 30 seconds -> default frequency of search every 5 seconds
		// 0-5-10-15-20-25-30 -> 1 element 16th sec - 4 sec wastage
		// Fluent wait -> 30 seconds/polling:2sec ->
			// 0-2-4-6-8-10.... -> 1 element 16th sec - no wastage
	
	WebDriver driver;
	Properties prop;
	WebDriverWait explicitWait;
	FluentWait<WebDriver> fl;
	
	SynchronizationConcept() {
		// Handling config file:
		// 1. Create instance of Properties class
		try {
			prop = new Properties();
			
			// 2. To read config file -> FileInputStream class -> need jar file for common IO
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace"
					+ "\\NovBatch\\src\\seleniumBasics\\config.properties"));
			
			// 3. Load file ready into Properties class instance
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void initialization() {
		// cross browser testing
		String browserName = prop.getProperty("browser");
		switch(browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
		 	driver = new EdgeDriver();
		 	break;
		default: 
			System.err.println("Browser not supported");
		}
		
		driver.manage().window().maximize();
		// implicit wait:
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds
				(Long.valueOf(prop.getProperty("implicitWaitTime"))));
		
		// ExplicitWait:
		explicitWait = new WebDriverWait
				(driver, Duration.ofSeconds(Long.valueOf(prop.getProperty("explicitWaitTime"))));
		
		// FluentWait:
		fl = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(Long.valueOf(prop.getProperty("fluentWaitTime"))))
					.pollingEvery(Duration.ofSeconds(Long.valueOf(prop.getProperty("pollingFrequency"))))
					.ignoring(NoSuchElementException.class);
		
		driver.get(prop.getProperty("testURL"));
	}
	
	void tearDown() {
		driver.quit();
	}
	
	void negativeSearchFunctionalityTest() { 
		WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
		
		// explicit wait:
		explicitWait.until(ExpectedConditions.visibilityOf(searchTxtBox));
//		explicitWait.until(ExpectedConditions.invisibilityOf(searchTxtBox)); // TimeoutException: Expected condition failed: waiting for invisibility of [[ChromeDriver: chrome on windows (b9831e861b063840b120db1b8ad16294)] -> id: gh-ac] (tried for 25 second(s) with 500 milliseconds interval)
		
		// fluent wait:
		fl.until(ExpectedConditions.visibilityOf(searchTxtBox));
		
		searchTxtBox.sendKeys(prop.getProperty("invalidSearchProduct"));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		WebElement noResultMsg = driver.findElement(By.xpath("//*[text()='No exact matches found']"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(noResultMsg));
		fl.until(ExpectedConditions.textToBePresentInElement(noResultMsg, "No exact matches found..")); // TimeoutException: Expected condition failed: waiting for text ('No exact matches found..') to be present in element [[ChromeDriver: chrome on windows (3c122fc7226137e44d4b69293b643d8e)] -> xpath: //*[text()='No exact matches found']] (tried for 25 second(s) with 5000 milliseconds interval)
		
		if(noResultMsg.isDisplayed()) {
			System.out.println("Negative Search functionality Test: Passed");
		}else{
			System.err.println("Negative Search functionality Test: Fail");
		}
	}
	
	public static void main(String[] args) {
		SynchronizationConcept sc = new SynchronizationConcept();
		sc.initialization();
		sc.negativeSearchFunctionalityTest();
		sc.tearDown();
		
	}
}
