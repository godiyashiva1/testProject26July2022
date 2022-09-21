package JavaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	@Test
	public void testcase4()
	{
		String actual = "Google";
		String expected = "Gooogle";
		
		try {
			Assert.assertEquals(actual, expected, "Asserrtion does not mached");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Equal Assertion Passed");
		
	}
	
}
