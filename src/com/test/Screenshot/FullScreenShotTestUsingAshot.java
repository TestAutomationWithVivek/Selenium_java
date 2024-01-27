package com.test.Screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import seleniumPractise.OpenBrowser;

public class FullScreenShotTestUsingAshot {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		String url = "https://www.automationtestinginsider.com/";
		driver = OpenBrowser.startBrowser("chrome", url);
	}
	
	@Test
	public void takeFullScreenShot() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Screenshot screenshot = new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(500))
				.takeScreenshot(driver);
		
		//copy the screenshot to desired location
		try {
			ImageIO.write(screenshot.getImage(), "png", new File("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\Screenshots\\FullScreenShot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}

}
