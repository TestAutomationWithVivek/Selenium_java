package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.parabank.utilities.Helper;

public class NewLoginPageParaBank extends Helper {
	//page webelement will be stored on this page
	
	WebDriver driver;
	public NewLoginPageParaBank(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//--------------------page elements---------------------------------------------
	/*
	 * @FindBy(how = How.NAME, using = "username") WebElement userName;
	 * 
	 * @FindBy(how = How.NAME, using = "password") WebElement password;
	 * 
	 * @FindBy(how = How.CLASS_NAME, using = "button") WebElement
	 * elememtButtonLogin;
	 * 
	 * //webdriver will not look for this webelement over this page. webdriver will
	 * check element in cash memory directly as it is in cashmemory now
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Register") WebElement elementRegisterLink;
	 */
	
	By userName = By.name("username");
	By password = By.name("password");
	By elementLoginButton = By.xpath("//input[@type = 'submit' ]");
	
	//-------------------Actions-----------------------------------------------------
	public void loginParaBank() {
		
		 // userName.sendKeys("vfadat"); password.sendKeys("12345");
		 // elememtButtonLogin.click();
		 
		driver.findElement(userName).sendKeys("vfadat");
		driver.findElement(password).sendKeys("12345");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean a = driver.findElement(elementLoginButton).isEnabled();
		System.out.println(a);
		driver.findElement(elementLoginButton).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
