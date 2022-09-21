package JavaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	//@Test
	public void a()
	{
		System.out.println("a Method");
	}
	@Test(enabled = false)
	public void b()
	{
		System.out.println("b Method");
	}
	
	//Test Case will executre 2 times
	@Test(invocationCount = 2)
	public void c()
	{
		System.out.println("c method");
	}
	
	@Test(invocationCount = 0)
	public void d()
	{
		System.out.println("d method");
	}
	
	@Test
	public void e()
	{
		System.out.println("e method");
		throw new SkipException("Skip e method");
		
	}
}
