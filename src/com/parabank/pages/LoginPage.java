package com.parabank.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	Properties properties;
	
	//This class will store webpage object , locator and methods
	By userName = By.name("username");
	By password = By.name("password");
	By elementLoginButton = By.className("button");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		properties = new Properties();
				try {
					FileInputStream io = new FileInputStream(System.getProperty("C:\\Eclips-SeleniumAutomation-Workspace\\AutomationJava\\src\\com\\para\\config\\config.properties"));
					properties.load(io);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException d) {
					d.printStackTrace();
				}
	}
	
	public void login() {
		System.out.println(properties.getProperty("username"));
		driver.findElement(userName).sendKeys(properties.getProperty("username"));
		driver.findElement(password).sendKeys(properties.getProperty("password"));
		driver.findElement(elementLoginButton).click();
	}

}
