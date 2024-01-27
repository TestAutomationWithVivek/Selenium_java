package seleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConceptHeadlessBroswerTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclips-SeleniumAutomation-Workspace\\drivers\\chromedriver.exe");
		//HtmlUnitDriver is not available in selenium 3.x version 
		//HtmlUnitDriver = to use this concept we have to dowload HtmlUnitDriver jar file
		//HtmlUnitDriver browser jar file has been downloaded by vivek on 11 december 2021 for this current project, you can see jar file in download
		
		// Advantages of HtmlUnitDriver
		//1. Testing is done behind the screen - no browser is launched
		//2. very fast as no involment of browser
		//3. Not applicable to actions Interface = user actions like mousemovement, double click, right click, drag and drop
		// It is aslo called Ghost browser, Headless browser
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getCurrentUrl());

	}

}
