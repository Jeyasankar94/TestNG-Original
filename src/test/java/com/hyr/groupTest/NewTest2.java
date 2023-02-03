package com.hyr.groupTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
@Test(groups="all2")
public class NewTest2 {
	
  @Test (groups = {"regression", "sanity","window.sanity"})
  public void fourth() {
	  System.out.println("Test 4");
  }
  @Test(groups= {"smoke","window.smoke","window.functional"})
  public void fifth() {
	  System.out.println("Test 5");
  }
  @Test(groups = {"sanity","functional","ios.smoke"})
  public void sixth() {
	  System.out.println("Test 6");
  }
  @Test(enabled=false)
  public void seventh() {
	  System.out.println("Test 7");
  }
}
