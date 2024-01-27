package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleIFrame {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		By elementIframe =  By.id("iFrame");
		By elementEmailId = By.className("header_mail");
		By elementSeleniumOnlineTrainingLink = By.xpath("//img[@data-image-title = 'SelenimTraining']");
		//By elementFrame = By.name("globalSqa");
		
		String url = "https://www.globalsqa.com/demo-site/frames-and-windows/";
	    driver = OpenBrowser.startBrowser("chrome", url);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(elementIframe).click();
		
		String emailId = driver.findElement(elementEmailId).getText();
		System.out.println(emailId);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame("globalSqa");
		driver.findElement(elementSeleniumOnlineTrainingLink).click();

	}

}
