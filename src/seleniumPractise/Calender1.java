package seleniumPractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Calender1 extends OpenBrowser{
	//public WebDriver driver;
	Properties properties;
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException {
		String url = "https://naveenautomationlabs.com/opencart";
		
		driver = OpenBrowser.startBrowser("chrome", url);
		properties = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\seleniumPractise\\config.properties");
		properties.load(ip);	
	}
	
	@Test
	public void calenderDateHandleTest() throws InterruptedException {
		System.out.println("Excute");
		Thread.sleep(4000);
		By elementComponentLink = By.linkText("Components");
		driver.findElement(elementComponentLink).click();
		Thread.sleep(2000);
		By elementMontiorsLink = By.partialLinkText("Monitors");
		driver.findElement(elementMontiorsLink).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		By elementAppleCinema30Link = By.partialLinkText("Apple Cinema 30");
		action.moveToElement(driver.findElement(elementAppleCinema30Link)).click().build().perform();
		By elementDateCalenderButton = By.xpath("//label[text() = 'Date']//..//span[//@class='fa fa-calendar']");
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(elementDateCalenderButton)).click().build().perform();
		Thread.sleep(2000);
		WebElement elementFirstDatePickerSwitch = driver.findElement(By.xpath("//div[contains(@class, 'dropdown-menu picker')]//div[@class='datepicker-days']//.//th[@class='picker-switch']"));
		elementFirstDatePickerSwitch.click();
		Thread.sleep(2000);
		WebElement elementMonthPickerSwitch = driver.findElement(By.xpath("//div[contains(@class, 'dropdown-menu picker')]//div[@class='datepicker-months']//.//th[@class='picker-switch']"));
		elementMonthPickerSwitch.click();
		Thread.sleep(2000);
		
		//Need to write code for selecting previous years and next years.
		List<WebElement> elementYears = driver.findElements(By.xpath("//div[@class = 'datepicker-years']//table//tbody//tr//td//span"));
		for(int i = 0; i < elementYears.size(); i++) {
			System.out.println(elementYears.get(i).getText());
			if(elementYears.get(i).getText().equals("2019")) {
				elementYears.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		//div[@class = 'datepicker-months']//table//tbody//tr//td//span
		List<WebElement> elementMonths = driver.findElements(By.xpath("//div[@class = 'datepicker-months']//table//tbody//tr//td//span"));
		for(int i = 0; i < elementMonths.size(); i++) {
			System.out.println(elementMonths.get(i).getText());
			if(elementMonths.get(i).getText().equals("Feb")) {
				elementMonths.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		String beforeXpath = "/html/body/div[4]/div/div[1]/table/tbody/tr[";
		String afterXpath = "/td[";
		final int totalWeekDays = 7;
		
		boolean flag = false;
		for(int rowNum = 1; rowNum <= 6; rowNum++) {
			for(int colNum = 1; colNum <= totalWeekDays; colNum++) {
				WebElement dateXpath = driver.findElement(By.xpath(beforeXpath+rowNum+"]"+afterXpath+colNum+"]"));
				System.out.println(dateXpath.getText());
				if(dateXpath.getText().equals("10")) {
					dateXpath.click();
					flag = true;
					break;
				}
				
			}
			
			if(false) {
				break;
			}
		}
		Thread.sleep(5000);

		
		driver.close();
	}

}
