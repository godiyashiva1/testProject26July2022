package JavaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {

	@Test
	public void assertionCheck()
	{
		String expected = "Event Details";
		String Acutal = "Event Details";
		
		try {
			Assert.assertEquals(Acutal, expected);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Text Verified");
	}


}
