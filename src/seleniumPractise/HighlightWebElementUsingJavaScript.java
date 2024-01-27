package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class HighlightWebElementUsingJavaScript {

	public static void main(String[] args) {
        WebDriver driver;
		
		By elementAcceptElementLink = By.id("Accepted Elements");
		By elementLinkTesterHub = By.xpath("//li[a[text() = 'Tester’s Hub']]");
		By elementDemoTestingSiteLink = By.xpath("//li[a[span[text() = 'Demo Testing Site']]]");
		By elementDragAndDropLink = By.xpath("//li[a[span[text() = 'Drag And Drop']]]");
		
		String url = "https://www.globalsqa.com/";
		driver = OpenBrowser.startBrowser("chrome", url);
		
		// Moving mouse to the element link tester hub using actions class
		
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
		actions.moveToElement(driver.findElement(elementDragAndDropLink)).click().build().perform();
		
		// applying explicit wait
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(elementAcceptElementLink));
		WebElement element = driver.findElement(elementAcceptElementLink);
		element.click();
		System.out.println(element.getText());
		highlightGivenWebElement(element, driver);
	}
	
	// convert Webdriver object into javaScriptExecutor class using type casting
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void highlightGivenWebElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgColorOfElement = element.getCssValue("backgroundColor");
		for(int i = 0; i < 100; i++) {
			changeColor("rgb(0, 200, 0)", element, driver);
			changeColor(bgColorOfElement, element, driver);
		}
	}

}
