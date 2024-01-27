package JavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloProgram {
	
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver95.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com");
		System.out.println(driver.getCurrentUrl() + "   "+ driver.getTitle());
	}

	public static void main(String[] args) {
		int elementLinkCount = 200;
		int elementButtonCount = 300;
		
		System.out.println("Hello world I am new Tester");
		
		System.out.println(elementLinkCount+elementButtonCount);
		
		HelloProgram helloProgram = new HelloProgram();
		helloProgram.openBrowser();
	}

}
