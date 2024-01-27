package seleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandlingWithAlertClass {

	public static void main(String[] args) {
		WebDriver driver;
		
		By elementSignInLink = By.id("signin_info");
		By elementSignInButton = By.className("signinbtn");
		
		
		String url = "https://www.rediff.com/";
		driver = OpenBrowser.startBrowser("chrome", url);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 50);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(elementSignInButton)
		 * );
		 */
		driver.findElement(elementSignInLink).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(elementSignInButton).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
