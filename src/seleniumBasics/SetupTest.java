package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SetupTest {

	public static void main(String[] args) throws InterruptedException {
	// Selenium 3:
		// 1. Set property -> which browser? & where is the driver?
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); // windows -> \\, need to define file extension | mac -> /, up to file name is enough
		
	// Selenium 4:
		// 2. Create instance of web driver specific to browser -> Polymorphism	
		WebDriver driver = new ChromeDriver(); // browser will be launched
		
		Thread.sleep(5000);
		// maximize browser
		driver.manage().window().maximize();
		
		// 3. load application
		driver.get("https://www.walmart.com");
		
		// Automation scripts ....
		
		// 4. closing app/browser
		driver.quit();

	}

}
