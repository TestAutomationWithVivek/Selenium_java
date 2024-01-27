package com.test.Screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import seleniumPractise.OpenBrowser;

public class ElementScreenShotTest {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		String url = "https://www.google.co.in/";
		driver = OpenBrowser.startBrowser("chrome", url);
	}
	
	@Test
	public void takeElementScreenshot() {
		WebElement element = driver.findElement(By.id("hplogo"));
		
		Screenshot screenshot = new AShot()
				.coordsProvider(new WebDriverCoordsProvider())
				.takeScreenshot(driver, element);
		
		//copy the element screenshot to desired location
		try {
			ImageIO.write(screenshot.getImage(), "png", new File("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\Screenshots\\ElementScreenShotGoogleLogo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}

}
