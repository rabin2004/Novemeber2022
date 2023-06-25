package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownCheckBoxRadioBtn {
	WebDriver driver;
	
	HandlingDropDownCheckBoxRadioBtn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void tearDown() {
		driver.quit();
	}
	
	void handlingDropDown() throws InterruptedException {
		// Drop down -> 1. Static - select tagName, Select class	| 2. Dynamic - mouse operation, Actions class
		
			// Static - select tagName, Select class -> 1. index | 2. visible txt | 3. value
		
		driver.get("https://www.amazon.com");
		WebElement allDropDown = driver.findElement(By.xpath("//select[@title='Search in']"));
		Select select = new Select(allDropDown);
		
//		Thread.sleep(3000);
//		select.selectByIndex(10);
//		Thread.sleep(3000);
//		select.selectByValue("search-alias=audible");
//		Thread.sleep(3000);
//		select.selectByVisibleText("Books");
		
		for(int i=0; i<30; i++) {
			select.selectByIndex(i);
			Thread.sleep(2000);
		}
	}
	
	void handlingCheckBox() throws InterruptedException {
		driver.get("https://www.amazon.com");
		WebElement accountListLink = driver.findElement(By.id("nav-link-accountList"));
		accountListLink.click();
		
		WebElement siginPageHeader = driver.findElement(By.
				cssSelector("[class='a-box-inner a-padding-extra-large']>.a-spacing-small"));

		if(siginPageHeader.isDisplayed()) {
			WebElement emailTxtBox = driver.findElement(By.name("email"));
			emailTxtBox.sendKeys("test@gmail.com");
			WebElement continueBtn = driver.findElement(By.id("continue"));
			continueBtn.click();
			WebElement passwordTxtBox = driver.findElement(By.id("ap_password"));
			passwordTxtBox.sendKeys("test123");
			
			// handling checkbox
			WebElement rememberMeCheckBox = driver.findElement(By.name("rememberMe"));
			Thread.sleep(2000);
			rememberMeCheckBox.click();
			Thread.sleep(2000);
			rememberMeCheckBox.click();
			
			WebElement signInBtn = driver.findElement(By.xpath("//*[@id='signInSubmit']"));
			signInBtn.click();
			
			WebElement loginErrorMsgHeader = driver.findElement(By.id("auth-warning-message-box"));
			if(loginErrorMsgHeader.isDisplayed()) {
				System.out.println("Negative Login Functionality test: Passed");
			}else {
				System.err.println("Negative Login Functionality test: Failed");
			}
		}else {
			System.err.println("Account list link: Failed");
		}
	}
	
	void handlingRadioBtn() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement roundTripRadioBtn = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		WebElement oneWayTripRadioBtn = driver.findElement(By.cssSelector("[value='oneway']"));
		
		if(roundTripRadioBtn.isSelected()) {
			oneWayTripRadioBtn.click();
		}
		
		Thread.sleep(3000);
		
		if(oneWayTripRadioBtn.isSelected()) {
			roundTripRadioBtn.click();
		}
		
		WebElement economyClassRadioBtn = driver.findElement(By.xpath("//input[@value='Coach']"));
		WebElement businessClassRadioBtn = driver.findElement(By.cssSelector("[value='Business']"));
		WebElement firstClassRadioBtn = driver.findElement(By.cssSelector("[value='First']"));
		
		if(economyClassRadioBtn.isSelected()) {
			businessClassRadioBtn.click();
			System.out.println("Economy class is select? "+economyClassRadioBtn.isSelected());
		}
		
		Thread.sleep(3000);
		
		if(businessClassRadioBtn.isSelected()) {
			firstClassRadioBtn.click();
		}
		
		Thread.sleep(3000);
		
		if(firstClassRadioBtn.isSelected()) {
			economyClassRadioBtn.click();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		HandlingDropDownCheckBoxRadioBtn hd = new HandlingDropDownCheckBoxRadioBtn();
//		hd.handlingDropDown();
//		hd.handlingCheckBox();
		hd.handlingRadioBtn();
		hd.tearDown();

	}

}
