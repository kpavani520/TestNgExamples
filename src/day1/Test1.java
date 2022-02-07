package day1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@AfterTest
	public void lastPriority() {
		System.out.println("I will execute last");
	}

	@Test(groups={"Smoke"})
	public void Method1() {
		System.out.println("This is my first TestNG case");

	}
	@Parameters({"URL"})
	@Test
	public void Method2(String urlname)
	{
		System.out.println("Print 2nd method");
		System.out.println(urlname);
	}
	
@AfterSuite
public void afSuite() {
	System.out.println("I am the number one from last");
}
}
