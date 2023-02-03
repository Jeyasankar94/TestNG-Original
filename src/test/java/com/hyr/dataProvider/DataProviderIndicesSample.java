package com.hyr.dataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIndicesSample {

	
	@Test(dataProvider="ld1")
	public void TestData(String s) {
		System.out.println(s);
	}
	@DataProvider(name = "ld1",indices = {0,4})
	public String[] loginTest() {
		String[] data = new String[] {
				"Ragav",
				"Nalin",
				"Dheeraj",
				"sanjay",
				"Jeya"
		};
		return data;
	}
}
