package com.hyr.dataProvider;

import org.testng.annotations.Test;

public class DataSupplier {

	@Test(dataProvider = "ld1",dataProviderClass=DataProviderIndicesSample.class)
	public void basicTest(String s) {
		System.out.println(s);
	}
	
}
