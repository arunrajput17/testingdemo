package com.brainmentors;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test

	public  void testlogin() {
		// Inside Selenium Code
		String title ="XRM";
		//Assert.assertEquals(title, "XRM");
		Assert.assertTrue(title.equals("XRM"));

	}

}
