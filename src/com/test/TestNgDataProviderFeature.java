package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class TestNgDataProviderFeature {
	WebDriver driver;
	
	@BeforeMethod
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Eclips-SeleniumAutomation-Workspace\\\\drivers\\\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");		
	}
	
	//@Test(priority = 0)
	public void login() {
		WebElement elementUserName = driver.findElement(By.name("username"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elementUserName.sendKeys("Vivekfadat@gmail.com");
		
		
		
		
		WebElement elementPassword = driver.findElement(By.name("password"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		elementPassword.sendKeys("Vivek@1234");
		
		WebElement elementButtonLOgIn = driver.findElement(By.xpath("//input[@class='button']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elementButtonLOgIn.click();
	}
	
	@Test(dataProvider = "getTestData", priority = 1)
	public void loginParaBank(String payeeName, String address, String city, String state, String zipCode, String phone, String accountNumber, String verifyAccountNumber, String amount) {
		WebElement elementUserName = driver.findElement(By.name("username"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elementUserName.sendKeys("Vivekfadat@gmail.com");
		
		
		
		
		WebElement elementPassword = driver.findElement(By.name("password"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		elementPassword.sendKeys("Vivek@1234");
		
		WebElement elementButtonLOgIn = driver.findElement(By.xpath("//input[@class='button']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elementButtonLOgIn.click();
		
		WebElement elementLinkBillPay = driver.findElement(By.linkText("Bill Pay"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elementLinkBillPay.click();
		
		WebElement elementPayeeName = driver.findElement(By.name("payee.name"));
		WebElement elementAddress = driver.findElement(By.name("payee.address.street"));
		WebElement elementCity = driver.findElement(By.name("payee.address.city"));
		WebElement elementState = driver.findElement(By.name("payee.address.state"));
		WebElement elementZipCode = driver.findElement(By.name("payee.address.zipCode"));
		WebElement elementPhone = driver.findElement(By.name("payee.phoneNumber"));
		WebElement elementAccountNumber = driver.findElement(By.name("payee.accountNumber"));
		WebElement elementVerifyAccountNumber = driver.findElement(By.name("verifyAccount"));
		WebElement elementAmount = driver.findElement(By.name("amount"));
		
		elementPayeeName.sendKeys(payeeName);
		elementAddress.sendKeys(address);
		elementCity.sendKeys(city);
		elementState.sendKeys(state);
		elementZipCode.sendKeys(zipCode);
		elementPhone.sendKeys(phone);
		elementAccountNumber.sendKeys(accountNumber);
		elementVerifyAccountNumber.sendKeys(verifyAccountNumber);
		elementAmount.sendKeys(amount);
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata = TestUtil.getDataFromExcel();
		
		return testdata.iterator();
	}
	
	@DataProvider
	public Iterator<Object[]> getTestDataFromLoginSheet() {
		ArrayList<Object[]> testdata = TestUtil.getDataFromLogin();
		
		return testdata.iterator();
	}

}
