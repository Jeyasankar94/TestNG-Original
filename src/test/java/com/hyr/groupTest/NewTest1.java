package com.hyr.groupTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
@Test(groups="all")
public class NewTest1 {
	
	@Test(groups= {"smoke", "sanity","window.sanity"})
	public void first() {
		System.out.println("Test 1");
	}	
	@Test (groups = {"regression","sanity"})
	public void second() {
		System.out.println("test 2");
	}
	@Test
	public void third() {
		System.out.println("Test 3");
	}
	@Test(groups = {"regression","functional","ios.smoke"})
	public void fourth() {
		System.out.println("Test 44");
	}

}
