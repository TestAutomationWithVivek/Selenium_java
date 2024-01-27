package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovementUsingActionsClass {

	public static void main(String[] args) {
		// Actions class is used for mouse movement and for drag and drop of webelement
		
		WebDriver driver;
		
		By elementAcceptElementLink = By.id("Accepted Elements");
		By elementLinkTesterHub = By.xpath("//li[a[text() = 'Tester’s Hub']]");
		By elementDemoTestingSiteLink = By.xpath("//li[a[span[text() = 'Demo Testing Site']]]");
		By elementDragAndDropLink = By.xpath("//li[a[span[text() = 'Drag And Drop']]]");
		By elementDraggableInvalidBox = By.id("draggable-nonvalid");
		By elementDraggableBox = By.id("draggable");
		By elementDoppableBox = By.id("droppable");
		
		String url = "https://www.globalsqa.com/";
		driver = OpenBrowser.startBrowser("chrome", url);
		
		// Moving to mouse to the element link tester hub using actions class
		
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
		driver.findElement(elementAcceptElementLink).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Drag and drop operation using actions class
		// Moving to the frame ;
		driver.switchTo().frame("demo-frame lazyloaded");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
		actions.dragAndDrop(driver.findElement(elementDraggableBox), driver.findElement(elementDoppableBox));

	}

}

