package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardInteractionConcept {
	WebDriver driver;
	
	MouseAndKeyboardInteractionConcept() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void tearDown() {
		driver.quit();
	}
	
	// Mouse & Keyboard interactions -> Actions class
			// Steps to follow: 1. Identify element - if action to be performed on it	| 2. define action/s	| 3. build() & perform()  
	
	void mouseOperationHandlingDynamicDropDown() throws InterruptedException {
		driver.get("https://www.amazon.com");
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
//		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		action.moveToElement(accountList).build().perform();
		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
		String linkToInteractUnderAccountList = "Watchlist";
		WebElement createAlistLink = driver.findElement(By
				.linkText(linkToInteractUnderAccountList));
		action.moveToElement(createAlistLink).click().build().perform();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your List";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Link interacted: "+linkToInteractUnderAccountList);
			System.out.println("Dynamic drop down test: Passed");
		}else {
			System.out.println("Link interacted: "+linkToInteractUnderAccountList);
			System.err.println("Dynamic drop down test: Failed");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MouseAndKeyboardInteractionConcept hki = new MouseAndKeyboardInteractionConcept();
		hki.mouseOperationHandlingDynamicDropDown();
		hki.tearDown();
	}
	
	// Assignment: Handling group of elements/web table/Calendar/trying some mouse operations

}
