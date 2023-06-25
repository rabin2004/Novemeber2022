package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementsWebtableCalendar {
	
	WebDriver driver;
	
	HandlingElementsWebtableCalendar() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void tearDown() {
		driver.quit();
	}
	
	void handlingGroupOfElements() {
		driver.get("https://www.amazon.com");
		List<WebElement> linksInHomepage = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in homepage: "+linksInHomepage.size());
		for(WebElement link: linksInHomepage) {
			System.out.println(link.getText()+" : "+link.getAttribute("href"));
		}
		
		List<WebElement> imagesInHomepage = driver.findElements(By.tagName("img"));
		System.out.println("Number of images in homepage: "+imagesInHomepage.size());
		for(WebElement img: imagesInHomepage) {
			System.out.println(img.getAttribute("alt"));
		}
	}
	
	void handlingWebTable() {
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		List<WebElement> offerTableRows = driver.findElements(By
				.xpath("//table[@width='270']/tbody/tr"));
		System.out.println("Actual offer table in the app: ");
		for(WebElement offerRow: offerTableRows) {
			String offerDestination = offerRow.findElement(By.xpath("td[1]/font")).getText();
			String offerAmount = offerRow.findElement(By.xpath("td[2]/div/font/b")).getText();
			System.out.println(offerDestination+" : "+offerAmount);
		}
	}
	
	void handlingCalendar() {
		driver.get("https://www.timeanddate.com/calendar/");
		String monthSelected = "April";
		String daySelected = "20";
		WebElement months2ndQuater = driver.findElement(By
				.xpath("//table[@id='mct1']/tbody/tr[6]"));
		switch(monthSelected) {
		case "April":
			List<WebElement> allAprilRows = months2ndQuater.findElements(By.xpath("td[1]/table/tbody/tr"));
			for(WebElement eachRow : allAprilRows) {
				List<WebElement> allCells = eachRow.findElements(By.xpath("td"));
				for(WebElement eachCell: allCells) {
					String eachCellTxt = eachCell.getText();
//					System.out.println(eachCellTxt);
					if(eachCellTxt.equals(daySelected)) {
						System.out.println(monthSelected+" "+daySelected+" : "+
					eachCell.getAttribute("title"));
						break;
					}
				}
			}
			break;
		case "May":
			List<WebElement> allMayRows = months2ndQuater.findElements(By.xpath("td[3]/table/tbody/tr"));
			for(WebElement eachRow : allMayRows) {
				List<WebElement> allCells = eachRow.findElements(By.xpath("td"));
				for(WebElement eachCell: allCells) {
					String eachCellTxt = eachCell.getText();
//					System.out.println(eachCellTxt);
					if(eachCellTxt.equals(daySelected)) {
						System.out.println(monthSelected+" "+daySelected+" : "+
					eachCell.getAttribute("title"));
						break;
					}
				}
			}
			break;
		case "June":
			List<WebElement> allJuneRows = months2ndQuater.findElements(By.xpath("td[5]/table/tbody/tr"));
			for(WebElement eachRow : allJuneRows) {
				List<WebElement> allCells = eachRow.findElements(By.xpath("td"));
				for(WebElement eachCell: allCells) {
					String eachCellTxt = eachCell.getText();
//					System.out.println(eachCellTxt);
					if(eachCellTxt.equals(daySelected)) {
						System.out.println(monthSelected+" "+daySelected+" : "+
					eachCell.getAttribute("title"));
						break;
					}
				}
			}
			break;
		}
		
	}

	public static void main(String[] args) {
		HandlingElementsWebtableCalendar hew = new HandlingElementsWebtableCalendar();
//		hew.handlingGroupOfElements();
//		hew.handlingWebTable();
		hew.handlingCalendar();
		hew.tearDown();

	}

}
