package JavaPractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapRealTimeUsage {
	
	public static HashMap<String,String> getCredentialsMap() {
		HashMap<String, String> credentials = new HashMap<String, String>();
		credentials.put("Customwer", "Vivek:Vivek@123");
		credentials.put("Admin", "amar:amarLab@123");
		credentials.put("seller", "vijay:VijayLab@123");
		credentials.put("Delivery", "arvind:Arvind@123");
		
		return credentials;
	}
	

	
	  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Browser Drivers\\chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.get("https://classic.crmpro.com/index.html");
	  
	  System.out.println(getCredentialsMap());
	  System.out.println(getCredentialsMap().get("seller"));
	  
	  driver.findElement(By.name("username")).sendKeys(getUserName("Delivery"));
	  driver.findElement(By.name("password")).sendKeys(getPassword("Delivery"));
	  //driver.quit();
	  }
	 
	  public static String getUserName(String role) {
		  String userName = getCredentialsMap().get(role);
		  return userName.split(":")[0];
	  }
	  
	  public static String getPassword(String role) {
		  String password = getCredentialsMap().get(role);
		  return password.split(":")[1];
	  }

}
