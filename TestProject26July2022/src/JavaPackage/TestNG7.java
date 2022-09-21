package JavaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {

	@Test
	public void z() {
		Assert.assertTrue(3>12);
		System.out.println("z method");
	}
	
	@Test(dependsOnMethods = {"z"})
	public void a ()
	{
		System.out.println("a method");
	}
	
}
