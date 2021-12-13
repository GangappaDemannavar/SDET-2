package Sdet;

import org.testng.annotations.Test;

public class ReadDataTest {
	
	@Test
	public void read()
	{
		System.out.println("readind data from cmd line");
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}

}
