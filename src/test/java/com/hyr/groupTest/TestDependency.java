package com.hyr.groupTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {

	static String trackingNumber = null;
	
	@Ignore
	@Test
	void CreateShipment() {
		System.out.println("CreateShipment");
		trackingNumber="ABC123HG";
	}

	@Test(dependsOnMethods = {"CreateShipment"})
	void TrackShipment() throws Exception {
		if(trackingNumber != null)
			System.out.println("Track shipment");
		else
			throw new Exception("invalid tracking number");
	}
	@Test(dependsOnMethods = {"CreateShipment","TrackShipment"})
	void CancelShipment() throws Exception {
		if(trackingNumber != null)
			System.out.println("Cancel Shipment");
		else
			throw new Exception("invalid tracking number");
	}
}
