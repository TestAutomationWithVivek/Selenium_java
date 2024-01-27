package com.test.Screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import seleniumPractise.OpenBrowser;

public class CropAndTakeScreenShotOfElement {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		String url = "https://login.wordpress.org/?locale=en_US";
		driver = OpenBrowser.startBrowser("chrome", url);
	}
	
	@Test
	public void croppingAndTakingScreenShotOfElement() throws IOException {
		WebElement element = driver.findElement(By.id("wp-submit"));
		
		//Get entire page screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImage = ImageIO.read(screenshot);
		
		//get height, width, location of element on the page
		//Point point = element.getLocation();
		Point point = element.getLocation();
		int elementWidth = element.getSize().getWidth();
		int elementHeight = element.getSize().getHeight();
		
		//crop the entire page screenshot to get only the element screenshot
		
		BufferedImage elementScreenShot = fullImage.getSubimage(point.getX(), point.getY(), elementWidth, elementHeight);
		try {
			ImageIO.write(elementScreenShot, "png", screenshot);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// copy the element screenshot to desired location
		File screenshotLocation = new File("C:\\\\Eclips-SeleniumAutomation-Workspace\\\\AutomationJava\\\\Screenshots\\\\elementCroppedScreenshot.png");
		FileUtils.copyFile(screenshot, screenshotLocation);
		
		driver.close();
	}
	

}
