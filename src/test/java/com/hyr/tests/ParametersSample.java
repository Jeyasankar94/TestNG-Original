package com.hyr.tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersSample {
	WebDriver driver;
	
	@Parameters("browsername")
	@BeforeTest // parameters name and method parameter need not to be same
	public void initialiseBrowser(@Optional("Chrome") String browsername) {
		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Browser name is invalid");
			break;
		}
		
		driver.manage().window().maximize();
		
	}
	@Parameters("sleepTime")
	@AfterTest
	public void tearDown(Long sleepTime) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(sleepTime);
		Thread.sleep(sleepTime);
		driver.quit();
	}
	@Parameters("url")
	@Test
	public void launchApp(String url) {
		driver.get(url);		
	}
	@Parameters({"username" , "password"})
	@Test
	public void enterLoginCredentials(String username, String password) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Test
	public void navigateToMyInfo() {
		driver.findElement(By.xpath("//span[text()='My Info']")).click();

	}
	@Test
	public void verifyMyInfo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean actualValue = driver.findElement(By.xpath("//label[text()='Employee Full Name']")).isDisplayed();	
		assertTrue(actualValue);
	}
	@Test
	public void verifyLogin() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//p[text()='Punched In']"));
		assertTrue(element.isDisplayed());
		assertTrue(element.getText().startsWith("Punched"));
	}


}
