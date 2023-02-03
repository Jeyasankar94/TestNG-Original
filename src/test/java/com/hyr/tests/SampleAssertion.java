package com.hyr.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAssertion {
	@Test
	public void testGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String actual = "HYR Tutorials - Google Searchhh";
		String expected = driver.getTitle();
		//	System.out.println(driver.getTitle());
		Assert.assertEquals(actual, expected,"This is mismatched");
		/*String actual2 = "HYR Tutorials - Google Searchhh";
		String expected2 = driver.getTitle();
		Assert.assertNotEquals(actual2, expected2);*/
		Thread.sleep(5000);
		driver.quit();
	}
}
