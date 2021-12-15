package Sdet;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Failed {

	@Test
	public void add()
	{
		System.out.println("Failed test case is running");
		
		System.out.println("Test script");
		Assert.fail("failed");
		
	}
}
