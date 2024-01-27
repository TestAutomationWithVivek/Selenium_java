package seleniumPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		String url = "https://www.google.com/";
		driver = OpenBrowser.startBrowser("chrome", url);
		
		//Type casting (converting) webdriver object into TakeScreenshot method for taking screenshot 
		// calling getScreenshotAs() method for storing screenshot in file format
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\seleniumPractise\\Screenshots\\google.com1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
