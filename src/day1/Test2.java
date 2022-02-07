package day1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void example()
	{
		System.out.println("Oola!");
	Assert.assertTrue(false);
	}
	@BeforeTest
		public void preRequest() {
		System.out.println("I will execute first");
	}
	@Test(groups= {"Smoke"})
	public void example1() {
		System.out.println("bye!");
	}
	@BeforeMethod
	public void bfMethod() {
		System.out.println("I will execute first for every method in this class");
	}
	@AfterMethod
	public void afMethod() {
		System.out.println("I wii execute After for every method in this class");
	}

}
