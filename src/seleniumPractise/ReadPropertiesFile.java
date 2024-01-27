package seleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReadPropertiesFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
	    FileInputStream ip = new FileInputStream("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\com\\para\\config\\config.properties");
	    properties.load(ip);
	    
	    String url = properties.getProperty("url");
	    String username = properties.getProperty("username");
	    System.out.println(username);
	    String password = properties.getProperty("password");
	    System.out.println(password);
	    String browserName = properties.getProperty("browser");
	    
	    By elementUserName = By.name("username");
		By elementPassword = By.name("password");
		By elementLoginButton = By.className("button");
	    
	    driver = OpenBrowser.startBrowser(browserName, url);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(elementUserName).sendKeys(username);
	    driver.findElement(elementPassword).sendKeys(password);
	    driver.findElement(elementLoginButton).click();
	}

}
