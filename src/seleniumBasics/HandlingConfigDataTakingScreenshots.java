package seleniumBasics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;

public class HandlingConfigDataTakingScreenshots {
	
	WebDriver driver;
	Properties prop;
	
	HandlingConfigDataTakingScreenshots(){
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
		driver.get(prop.getProperty("testURL"));
	}
	
	void tearDown() {
		driver.quit();
	}
	
	void homePageTitleTest() {
		String expectedTitle = driver.getTitle();
		if(expectedTitle.contains("eBay")) {
			System.out.println("Home page title test: Passed");
		}else {
			System.err.println("Home page title test: Failed");
		}
	}
	
	void takingScreenshots() { 
		// TakesScreenshot class
		// getScreenshotAs() ->  1. screenshot of the page | 2. screenshot of the element
		WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));		
		searchTxtBox.sendKeys(prop.getProperty("invalidSearchProduct"));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		WebElement noResultMsg = driver.findElement(By.xpath("//*[text()='No exact matches found']"));
		if(noResultMsg.isDisplayed()) {
			// taking screenshot of the page
			try {
				File searchResultPageScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(searchResultPageScreen, new File("C:\\Users\\User\\eclipse-workspace"
						+ "\\NovBatch\\src\\seleniumBasics\\searchResultPageScreen.png"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// taking screenshot of the element
			try {
				File noResultMsgImage = noResultMsg.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(noResultMsgImage, new File("C:\\Users\\User\\eclipse-workspace"
						+ "\\NovBatch\\src\\seleniumBasics\\noResultErrorMsg.png"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		HandlingConfigDataTakingScreenshots hcd = new HandlingConfigDataTakingScreenshots();
		hcd.initialization();
//		hcd.homePageTitleTest();
		hcd.takingScreenshots();
		hcd.tearDown();

	}
	
	// Assignment: 1. Try mouse keyboard operation - drag & drop 2. Use config file and handle config data separately 3. Integrate taking screenshot if test case fails 4. Pick any app and try using knowledge learnt so for for few features

}
