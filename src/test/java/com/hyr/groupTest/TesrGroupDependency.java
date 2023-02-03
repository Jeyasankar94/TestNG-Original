package com.hyr.groupTest;

import org.testng.annotations.Test;

public class TesrGroupDependency {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("smoke");
	}
	@Test(groups = "smoke")
	public void test2() {
		System.out.println(5/0);
	}
	@Test(groups = "regression")
	public void test5() {
		System.out.println("regression");
	}
	@Test(groups = "regression")
	public void test6() {
		System.out.println("regression");
	}
	@Test(groups = "sanity")
	public void test3() {
		System.out.println("sanity");
	}
	@Test(dependsOnGroups = {"smoke","sanity"}, alwaysRun = true)
	public void test4() {
		System.out.println("Main Test");
	}
}
