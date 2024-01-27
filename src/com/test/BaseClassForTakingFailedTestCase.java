package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.io.FileUtils;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClassForTakingFailedTestCase {
	public static WebDriver driver;
	
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Eclips-SeleniumAutomation-Workspace\\\\drivers\\\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
	}
	
	public void failedMethod() {
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\com\\test\\Screenshot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
