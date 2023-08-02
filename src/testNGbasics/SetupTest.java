package testNGbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SetupTest {
	WebDriver driver;
	Properties prop;
	WebDriverWait explicitWait;
	FluentWait<WebDriver> fl;
	
	SetupTest() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\eclipse-workspace"
					+ "\\NovBatch\\src\\seleniumBasics\\config.properties"));
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
  @Test // Test annotation -> representing test method/case
  public void negativeSearchFunctionalityTest() {
	  	WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
		explicitWait.until(ExpectedConditions.visibilityOf(searchTxtBox));		
		fl.until(ExpectedConditions.visibilityOf(searchTxtBox));
		
		searchTxtBox.sendKeys(prop.getProperty("invalidSearchProduct"));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		WebElement noResultMsg = driver.findElement(By.xpath("//*[text()='No exact matches found']"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(noResultMsg));
		fl.until(ExpectedConditions.textToBePresentInElement(noResultMsg, "No exact matches found"));
		
		// Verification point
//		if(noResultMsg.isDisplayed()) {
//			System.out.println("Negative Search functionality Test: Passed");
//		}else{
//			System.err.println("Negative Search functionality Test: Fail");
//		}
		
		// Validation point -> Assertion -> 1. assertEquals(actual, expected) | 2. assertTrue() | 3. assertFalse()
		Assert.assertTrue(noResultMsg.isDisplayed());
  }
  
  @Test // Test annotation -> representing test method/case
  public void positiveSearchFunctionalityTest() {
	  	WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
		searchTxtBox.sendKeys(prop.getProperty("validSearchProduct"));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement searchResultHeader = driver.findElement(By.className("srp-controls__count-heading"));
		
		Assert.assertTrue(searchResultHeader.isDisplayed());
  }
  
  @BeforeMethod // Before method annotation -> pre-requisite block
  public void initialization() {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds
				(Long.valueOf(prop.getProperty("implicitWaitTime"))));
		explicitWait = new WebDriverWait
				(driver, Duration.ofSeconds(Long.valueOf(prop.getProperty("explicitWaitTime"))));
		fl = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(Long.valueOf(prop.getProperty("fluentWaitTime"))))
					.pollingEvery(Duration.ofSeconds(Long.valueOf(prop.getProperty("pollingFrequency"))))
					.ignoring(NoSuchElementException.class);
		driver.get(prop.getProperty("testURL"));
  }

  @AfterMethod // After method annotation -> post-requisite block
  public void tearDown() {
	  driver.quit();
  }
  
  // Assignment: 1. Practice Synchronization | 2. Get TestNG installed | 3. Do TestNg setup test | 4. Try couple of features automation testing with TestNG

}
