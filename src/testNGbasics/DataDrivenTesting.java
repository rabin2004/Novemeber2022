package testNGbasics;

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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	WebDriver driver;
	Properties prop;
	WebDriverWait explicitWait;
	FluentWait<WebDriver> fl;
	
	// Data Driven Testing with TestNG:
		// 1. @DataProvider annotations - to create data providing method -> hold data in Array(1D or 2D) - returns array
		// 2. dataProviderClass and/or dataProvider keyword in test method
		// 3. defining method parameter
		// 4. Use parameter in the code
	
	// Data providing method -> 1. in same class | 2. in same package | 3. in different package
	
	DataDrivenTesting() {
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
	
	@DataProvider
	public String[] positiveSearchFunctionalityData() {
		String[] data = {	"apple",
							"samsung",
							"microsoft",
							"pixel",
							"nokia"};
		return data;
	}
	
//@Test(enabled=false) // enabled=false -> test method execution to ignore this method | if true - method will execute
// priority=0/1/2..... - Changing sequence or test method execution
	
	@Test(enabled=true, dataProviderClass=SearchFunctionalityTestData.class, 
		  dataProvider="negativeSearchFunctionalityData", priority = 2,
		  dependsOnMethods="searchFunctionalityUIelementValidation")
  public void negativeSearchFunctionalityTestByHittingEnterKey(String invalidProduct) {
	  	WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
		
		searchTxtBox.sendKeys(invalidProduct);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement noResultMsg = driver.findElement(By.xpath("//*[text()='No exact matches found']"));
		Assert.assertTrue(noResultMsg.isDisplayed());
  }
  
  @Test(enabled=true, dataProviderClass=seleniumBasics.SearchFunctionalityTestData.class, 
		  dataProvider="negativeSearchFunctionalityData", priority = 3,
		  dependsOnMethods="searchFunctionalityUIelementValidation")
  public void negativeSearchFunctionalityTestByClickingSearchBtn(String invalidProduct) {
	  	WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
		searchTxtBox.sendKeys(invalidProduct);
		WebElement searchtBtn = driver.findElement(By.id("gh-btn"));
		searchtBtn.click();
		WebElement noResultMsg = driver.findElement(By.xpath("//*[text()='No exact matches found']"));
		Assert.assertTrue(noResultMsg.isDisplayed());
  }
  
  @Test(dataProvider="positiveSearchFunctionalityData", priority=0,
		  dependsOnMethods="searchFunctionalityUIelementValidation")
  public void positiveSearchFunctionalityTestByHittingEnterKey(String product) {
	  	WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
		searchTxtBox.sendKeys(product);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement searchResultHeader = driver.findElement(By.className("srp-controls__count-heading"));
		
		Assert.assertTrue(searchResultHeader.isDisplayed());
  }
  
  @Test(dataProvider="positiveSearchFunctionalityData", priority=1,
		  dependsOnMethods="searchFunctionalityUIelementValidation")
  public void positiveSearchFunctionalityTestByClickingSearchBtn(String product) {
	  	WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
		searchTxtBox.sendKeys(product);
		WebElement searchtBtn = driver.findElement(By.id("gh-btn"));
		searchtBtn.click();
		WebElement searchResultHeader = driver.findElement(By.className("srp-controls__count-heading"));
		
		Assert.assertTrue(searchResultHeader.isDisplayed());
  }
  
  
  // default test method are independent
  // dependency can be created by using -> dependsOnMethods keyword
  // if method depending on fails -> then rest of the dependent methods will be skipped
  
  @Test
  public void searchFunctionalityUIelementValidation() {
	  WebElement searchTxtBox = driver.findElement(By.id("gh-ac"));	
	  WebElement searchtBtn = driver.findElement(By.id("gh-btn"));
	  
	  Assert.assertTrue(searchTxtBox.isDisplayed());
	  Assert.assertTrue(searchTxtBox.isEnabled());
	  Assert.assertTrue(searchtBtn.isDisplayed());
	  Assert.assertTrue(searchtBtn.isEnabled());
	  searchtBtn.click();
  }
  
  @BeforeClass
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

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
  
  @AfterMethod
  public void toLastPage() {
	  driver.navigate().back();  
  }

}
