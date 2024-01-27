package seleniumPractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTable {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		String url = "https://ui.cogmento.com/";
		
		//intialise chrome browser and open freecrm.com
		driver = OpenBrowser.startBrowser("chrome", url);
		Properties properties = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\seleniumPractise\\config.properties");
		properties.load(ip);
		
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
		By elementLinkContactIcon = By.xpath("//a[i[@class = 'users icon']]");
		//Thread.sleep(3000);
		driver.findElement(elementLinkContactIcon).click();
		Actions actions = new Actions(driver);
		By elementButtonShowFilter = By.xpath("//button[text() = 'Show Filters']");
		actions.moveToElement(driver.findElement(elementButtonShowFilter)).build().perform();
		Thread.sleep(3000);
		
		//Method 1
		//intialrowxpath = //*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
		//secondrow = //*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a
		
		/*
		 * String beforeXpath =
		 * "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr["; String afterXpath
		 * = "]/td[2]/a"; for(int i = 1; i <=7; i++) { String name =
		 * driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
		 * System.out.println(name); if(name.equals("vivek f")) {
		 * driver.findElement(By.xpath(beforeXpath + i + afterXpath)).click(); break; }
		 * }
		 */
		
		//Method 2 = custimization of xpath from table i.e finding exact xpath
		//xpath for clicking checkbox ahead of contact = //a[contains(text(), 'vivek f')]/parent::td//preceding-sibling::td//input[@name = "id"]
		String contactText = driver.findElement(By.xpath("//a[contains(text(), 'vivek f')]//..//td")).getText();
		System.out.println(contactText);

	}

}
