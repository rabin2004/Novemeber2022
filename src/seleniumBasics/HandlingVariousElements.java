package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingVariousElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		// Negative login functionality test
		WebElement accountListLink = driver.findElement(By.id("nav-link-accountList"));
		accountListLink.click();
		
		WebElement siginPageHeader = driver.findElement(By.cssSelector("#authportal-main-section "
				+ "> div:nth-child(2) > div > div.a-section > form > div > div > div > h1"));

		if(siginPageHeader.isDisplayed()) {
			WebElement emailTxtBox = driver.findElement(By.name("email"));
			emailTxtBox.sendKeys("test@gmail.com");
			WebElement continueBtn = driver.findElement(By.id("continue"));
			continueBtn.click();
			WebElement passwordTxtBox = driver.findElement(By.id("ap_password"));
			passwordTxtBox.sendKeys("test123");
			WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
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
		
		driver.quit();
	}

}
