package assertions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTypes {
	
	@Test
	public void test1() {
		SoftAssert soft = new SoftAssert();
		String expectedName = "James";
		int expectedAge = 28;
		
		soft.assertEquals("Ronaldo", expectedName);
		soft.assertEquals(32, expectedAge);
		System.out.println("Ending the test");
		soft.assertAll();
	}
	
	@Test
    private void w() {
		SoftAssert soft = new SoftAssert();
		System.out.println("second test method starting");
		String s = "Hi";
		soft.assertEquals("Hi", s);
		soft.assertAll();
	}
	
	@AfterTest
	private void ending() {	
	}
	

}
