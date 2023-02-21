package com.hyr.dataProvider;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNGException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAttributes {

	@Test(expectedExceptions = {NoSuchElementException.class})
	public void TestLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();			
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		
		driver.findElement(By.name("abcd")).sendKeys("Admin");
}
}