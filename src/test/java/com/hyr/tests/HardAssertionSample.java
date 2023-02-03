package com.hyr.tests;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionSample {
	@Test
	public void openFacebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Aadhiran", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		//Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
	    assertEquals(actualTitle, expectedTitle, "Title is Mismatched ");
		
		//URL Assertion
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/45";
		assertEquals(actualURL, expectedURL," URL is mismatched");
		
		//Text Assertion
		String actualText = driver.findElement(By.id("email")).getAttribute("value");
		String expectedText = "";
		assertEquals(actualText, expectedText, "Username text is mismatched");
		
		//Border Assertion
		String actualBorder = driver.findElement(By.id("email")).getCssValue("border");
		String expectedBorder = "1px solid rgb(240, 40, 73)";// in seleinium spacing required after comma and need to convert hex to RGB
		assertEquals(actualBorder, expectedBorder, "Bordfer is mismatched");
		
		//ErrorMessage Assertion
		String actualError = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedError = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		assertEquals(actualError, expectedError, "Username Error message is mismatched");
		
		driver.quit();
	}

}
