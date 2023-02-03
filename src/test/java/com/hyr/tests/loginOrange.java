package com.hyr.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginOrange {
	WebDriver driver;

	@BeforeTest
	public void initialiseBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void launchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/");		
	}
	@Test
	public void enterLoginCredentials() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Test
	public void navigateToMyInfo() {
		driver.findElement(By.xpath("//span[text()='My Info']")).click();

	}
	@Test
	public void verifyMyInfo() {
		driver.findElement(By.xpath("//label[text()='Employee Full Name']")).isDisplayed();	
	}
	@Test
	public void verifyLogin() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//p[text()='Punched In']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
	}


}
