package JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStringCharacterSequence {
	WebDriver driver;
	
	public void loginFacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	public void sendKeyCharacterSequenceByString() {
		loginFacebook();
		String s1 = "Vivek";
		String s2 = "Fadat";
		WebElement elementUserName = driver.findElement(By.id("email"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		elementUserName.sendKeys(s1," ", s2);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//driver.quit();
	}
	
	public void sendKeyCharacterSequenceByStringBuilder() {
		loginFacebook(); 
		StringBuilder userName = new StringBuilder()
		.append("vivek")
		.append(" ")
		.append("automation")
		.append(" ")
		.append("Lab")
		.append(" ")
		.append("Fadat");
		
		System.out.println(userName);
		if(userName.equals(null)) {
			System.out.println(true);
		} else {
			System.out.println("string builder is not empty");
		}
		
		WebElement elementUserName = driver.findElement(By.id("email"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elementUserName.sendKeys(userName);
		driver.quit();
	}
	
	public void sendKeyCharacterSequenceByStringBuffer() {
		StringBuffer userName = new StringBuffer();
		userName.append("vijay");
		userName.append(" ");
		userName.append("narayan");
		userName.append(" ");
		userName.append("ramesh");
		userName.append(" ");
		String userNameWithString = "ramoji";
		StringBuilder userNameWithstringBiulder = new StringBuilder("amar");
		
		loginFacebook();
		WebElement elementUserName = driver.findElement(By.id("email"));
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		elementUserName.sendKeys(userName, userNameWithString, " ", userNameWithstringBiulder);
	}

	public static void main(String[] args) {
		SendKeyStringCharacterSequence sendKeyStringCharacterSequence = new SendKeyStringCharacterSequence();
		//sendKeyStringCharacterSequence.sendKeyCharacterSequenceByString();
		//sendKeyStringCharacterSequence.sendKeyCharacterSequenceByStringBuilder();
		sendKeyStringCharacterSequence.sendKeyCharacterSequenceByStringBuffer();

	}

}
