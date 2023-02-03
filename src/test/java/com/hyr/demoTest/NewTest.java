package com.hyr.demoTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class NewTest {
	
	@Test(enabled=true)
	public void first() {
		System.out.println("test 1");
	}	
	@Test
	public void second() {
		System.out.println("test 2");
	}
	@Test
	public void third() {
		System.out.println("test 3");
	}

}
