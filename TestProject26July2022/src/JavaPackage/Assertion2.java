package JavaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testcase2()
	{
		int a = 10;
		int b = 20;
		
		String actual = "Google";
		String expected = "Google";
		
		Assert.assertEquals(actual, expected, "Assertion Passed");
		System.out.println("Equal Assertion Passed");
		
		Assert.assertFalse(a>b, "assert conditin failed");
		System.out.println("False assertion passed");
		
		Assert.assertTrue(a>b, "assert conditin false");
		
		System.out.println("We are checking assertion");
				
	}
	
	@Test
	public void testcase3()
	{
		System.out.println("Hellow");
	}
}
