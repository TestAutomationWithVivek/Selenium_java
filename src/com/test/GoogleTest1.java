package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest1 {
	WebDriver driver;
	
	By elementGmailLink = By.xpath("//div[a[text()='Gmail']]");
	By elementImagesLink = By.xpath("//div[a[text()='Images']]");
	
	
	    //Test case --- starting with "@TEst"
		@Test
		public void googleGmailTitleTest() throws InterruptedException {
			System.out.println("@Test-----get title of gmail");
			Thread.sleep(3000);
			System.out.println(driver.findElement(elementGmailLink).getText());
		}
		
		@Test
		public void VerifyImagesLink() throws InterruptedException {
			System.out.println("@Test--------- get title of Images link");
			Thread.sleep(3000);
			System.out.println(driver.findElement(elementImagesLink).getText());
		}
		
		@Test
		public void clickImagesLinki() throws InterruptedException {
			System.out.println("@Test--------- click the images link");
			Thread.sleep(3000);
			driver.findElement(elementImagesLink).click();
			Thread.sleep(3000);
		}
		
		@Test
		public void verifyHindiIsNotAvailablePostClickingImages() throws InterruptedException {
			System.out.println("@Test--------- verify Hindi is not available post clicking images");
			Thread.sleep(3000);
			driver.findElement(elementImagesLink).click();
			Thread.sleep(3000);
			}
		
		@Test
		public void nameOfTheSite3() {
			System.out.println("@Test--------- print the name of the browser");
		}

}
