package seleniumPractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.parabank.utilities.Helper;

public class WindowHandleSeleniumDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://www.globalsqa.com/";
		
		By elementLinkOpenNewWindow = By.id("Open New Window");
		By elementLinkTesterHub = By.xpath("//li[a[text() = 'Tester’s Hub']]");
		By elementDemoTestingSiteLink = By.xpath("//li[a[span[text() = 'Demo Testing Site']]]");
		By elementFramesAndWindowsLink = By.xpath("//li[a[span[text() = 'Frames And Windows']]]");
		By elementLinkClickHere = By.linkText("Click Here");
		
		driver = OpenBrowser.startBrowser("chrome", url);
		
		Actions actions = new Actions(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.moveToElement(driver.findElement(elementLinkTesterHub)).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.moveToElement(driver.findElement(elementDemoTestingSiteLink)).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actions.moveToElement(driver.findElement(elementFramesAndWindowsLink)).click().build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(elementLinkOpenNewWindow).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(elementLinkClickHere).click();
		
		Set windowIDs = driver.getWindowHandles();
		Iterator<String> itr = windowIDs.iterator();
		
		String parentWindowId = itr.next();
		System.out.println(parentWindowId);
		
		String childWindowID = itr.next();
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());

	}

}
