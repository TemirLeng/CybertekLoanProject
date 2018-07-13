package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.DataStorage;

public class Google {
	
	String store;
	
	@BeforeClass
	private void setup() {
		System.out.println("Setup the environment");		
	}
	
	@Test
	private void googleSearch() {
		System.out.println("Searching item and validating");
		store = "iphone 9";
//		DataStorage.addData("myKey", "iphone 9");
	}
	
	@Test
	private void googleAd() {
		System.out.println("Google advertisement test");
		// TODO Auto-generated method stub

	}
	
	@Test
	private void wgoogleImage() {
		System.out.println("Verifying ");
		// TODO Auto-generated method stub

	}

}
