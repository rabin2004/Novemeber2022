package seleniumBasics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertWindowsElements {
	WebDriver driver;
	
	HandlingAlertWindowsElements() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void tearDown() {
		driver.quit(); // quit() -> close all the window opened by that driver instance
	}
	
	void handlingAlert() throws InterruptedException { // alert/java alert/pop-up message -> switchTo().alert() -> 1. get txt | 2. accept | 3. deny
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement customerIDtxnBox = driver.findElement(By.name("cusid"));
		customerIDtxnBox.sendKeys("test123");
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		Thread.sleep(5000);
		
		// without handling alert -> UnhandledAlertException: unexpected alert open: {Alert text : Do you really want to delete this Customer?}
//		WebElement resetBtn = driver.findElement(By.name("res"));
//		resetBtn.click();
		
		String expectedAlertMsg1 = "Do you really want to delete this Customer?";
		String expectedAlertMsg2 = "Customer Successfully Delete!";
		
		String actualAlertMsg1 = driver.switchTo().alert().getText();
		if(actualAlertMsg1.equals(expectedAlertMsg1)){
//			driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss();
			
			// if not alert handle -> NoAlertPresentException: no such alert
			
			String actualAlertMsg2 = driver.switchTo().alert().getText();
			if(actualAlertMsg2.equals(expectedAlertMsg2)) {
				driver.switchTo().alert().accept();
			}else {
				System.err.println("Alert-2 msg validation: Failed");
				System.out.println("Actual: "+actualAlertMsg2);
				System.out.println("Expected: "+expectedAlertMsg2);
			}
		}else {
			System.err.println("Alert-1 msg validation: Failed");
			System.out.println("Actual: "+actualAlertMsg1);
			System.out.println("Expected: "+expectedAlertMsg1);
		}
		
		WebElement resetBtn = driver.findElement(By.name("res"));
		resetBtn.click();
	}
	
	void handlingWindows() throws InterruptedException {
		String url = "https://the-internet.herokuapp.com/windows";
		driver.get(url);
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		clickHereLink.click();
		// driver's control still on primary/parent window
		clickHereLink.click();
//		System.out.println(driver.getTitle());
//		System.out.println(url.equals(driver.getCurrentUrl()));
		
		// getWindowHandle() Vs getWindowHandles()
//		System.out.println("Parent window handle: "+driver.getWindowHandle());
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Number of window opened: "+handles.size());
		System.out.println(handles);
		
		// switchTo().window(handle)
		for(String handle: handles) {
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			driver.close(); // close() -> will only close window on which driver exerts control
			Thread.sleep(3000);
		}
	}
	
	void handlingMultipleElements() {
		// findElements() -> multiple elements
		driver.get("https://www.ebay.com/adchoice");
		List<WebElement> footerLinks = driver.findElements(By.cssSelector("#gf-l>li"));
		System.out.println("Number of footer links: "+footerLinks.size());
		for(WebElement link: footerLinks) {
//			link.click();
//			System.out.println(driver.getTitle());
//			driver.navigate().back(); // StaleElementReferenceException: stale element reference: stale element not found
			String linkTxt = link.findElement(By.tagName("a")).getText();
			System.out.println(linkTxt);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		HandlingAlertWindowsElements ha = new HandlingAlertWindowsElements();
//		ha.handlingAlert();
//		ha.handlingWindows();
		ha.handlingMultipleElements();
		ha.tearDown();

	}
	// Assignment: 1. Demo app -> flight booking & registration | 2. all the topics | 3. Any app - 3-4 features and create multiple automation test scenarios

}
