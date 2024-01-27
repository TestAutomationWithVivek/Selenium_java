package seleniumPractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalenderTest {
	public WebDriver driver;
	Properties properties;
	
	@BeforeClass
	public void setUp() throws IOException {
        String url = "https://ui.cogmento.com/";
		
		//intialise chrome browser and open freecrm.com
		driver = OpenBrowser.startBrowser("chrome", url);
		properties = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\seleniumPractise\\config.properties");
		properties.load(ip);
	}
	
	@Test
	public void selectDateFromCalender() {
		//By elementLOginButton = By.xpath("//span[text() = 'Log In']");
		//driver.findElement(elementLOginButton).click();
		
		// adding explict wait here because after clicking on LOg In button new page is loaded and it takes time to element
		By elementEmailAddres = By.name("email");
		By elementPassword = By.name("password");
		By elementSignInButton = By.xpath("//div[text() = 'Login']");
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(elementSignInButton));
		
		driver.findElement(elementEmailAddres).sendKeys(properties.getProperty("username"));
		driver.findElement(elementPassword).sendKeys(properties.getProperty("password"));
		driver.findElement(elementSignInButton).click();
		By elementLinkCalenderIcon = By.xpath("//a[i[@class = 'calendar icon']]");
		//Thread.sleep(3000);
		driver.findElement(elementLinkCalenderIcon).click();
		

	}

}
