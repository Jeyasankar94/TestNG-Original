package com.hyr.tests;

import org.testng.annotations.Test;

public class FlightBookingTest {
	
	@Test(priority=1)
	public void signup() {
		System.out.println("signup");
	}
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=-3)
	public void searchForFlight() {
		System.out.println("searchfor flight");
	}
	@Test(priority=4)
	private void bookTheFlight() {
		System.out.println("bookTheFlight");
	}
	@Test(priority=5)
	private void saveTheTicket() {
		System.out.println("saveTheTicket");
	}
	@Test(priority=6)
	private void logout() {
		System.out.println("logout");
	}

}
