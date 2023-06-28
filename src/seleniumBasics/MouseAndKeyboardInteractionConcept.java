package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	void mouseAndKeyboardOperation() throws InterruptedException {
		driver.get("https://www.amazon.com");
		Actions action = new Actions(driver);
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		action.moveToElement(searchTxtBox).build().perform();
		Thread.sleep(3000);
		action.click().build().perform();
		
		String product1 = "samsung";
		Thread.sleep(3000);
		action.sendKeys(product1).build().perform();
		Thread.sleep(3000);
		action.doubleClick().build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		String product2 = "microsoft";
		Thread.sleep(3000);
		action.sendKeys(product2).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		String actualSearchPageTitle = driver.getTitle();
		String expectedSearchPageTitle = "Amazon.com : "+product2;
		if(actualSearchPageTitle.equals(expectedSearchPageTitle)) {
			System.out.println("Search functionality: Passed");
		}else{
			System.err.println("Search functionality: Failed");
		}
	}
	
	void dragAndDropOperation() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement bankDragElement = driver.findElement(By.cssSelector("#credit2>a"));
		WebElement fiveHunderdDrag1 = driver.findElement(By.
				xpath("//li[2]/a[@class='button button-orange']"));
		WebElement salesDragElement = driver.findElement(By.cssSelector("#credit1>a"));
		WebElement fiveHunderdDrag2 = driver.findElement(By.
				xpath("//li[4]/a[@class='button button-orange']"));
		WebElement drop1 = driver.findElement(By.id("bank"));
		WebElement drop2 = driver.findElement(By.id("amt7"));
		WebElement drop3 = driver.findElement(By.id("loan"));
		WebElement drop4 = driver.findElement(By.id("amt8"));
		
		Actions action = new Actions(driver);
		// #1
		action.dragAndDrop(bankDragElement, drop1).build().perform();
		Thread.sleep(3000);
		
		// #2
		action.clickAndHold(fiveHunderdDrag1).release(drop2).build().perform();
		Thread.sleep(3000);
		
		// #3
		action.moveToElement(salesDragElement).clickAndHold().moveToElement(drop3)
		.release().build().perform();
		Thread.sleep(3000);
		
		// #4
		action.moveToElement(fiveHunderdDrag2).clickAndHold().build().perform();
		Thread.sleep(3000);
		action.moveToElement(drop4).release().build().perform();
		Thread.sleep(3000);
		
		WebElement perfectMsg = driver.findElement(By.cssSelector(".table4_result>a"));
		if(perfectMsg.isDisplayed()) {
			System.out.println("Drag and drop: Passed");
		}else {
			System.err.println("Drag and drop: Failed");
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		MouseAndKeyboardInteractionConcept hki = new MouseAndKeyboardInteractionConcept();
//		hki.mouseOperationHandlingDynamicDropDown();
//		hki.mouseAndKeyboardOperation();
		hki.dragAndDropOperation();
		hki.tearDown();
	}
	
	// Assignment: Handling group of elements/web table/Calendar/trying some mouse operations

}
