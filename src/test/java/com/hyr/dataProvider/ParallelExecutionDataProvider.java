package com.hyr.dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionDataProvider {
	
	@Test(dataProvider = "loginData")
	public void TestLogin(String userName, String passWord) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();			
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed());	
		driver.quit();
	}
	@DataProvider(parallel = true)
	public Object[][] loginData() {
		Object[][] data = new Object[6][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "Admin";
		data[1][1] = "test123";
		data[2][0] = "xyz";
		data[2][1] = "admin123";
		data[3][0] = "abcd";
		data[3][1] = "123";	
		data[4][0] = "xyz";
		data[4][1] = "admin123";
		data[5][0] = "abcd";
		data[5][1] = "123";	
		return data;
	}
}
