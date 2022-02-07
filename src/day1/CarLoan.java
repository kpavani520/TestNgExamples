package day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	@Test(groups= {"Smoke"})
	public void webLogin() {
		System.out.println("Web Login");
	}
	@Parameters({"URL","UserName"})
	@Test
	public void MobileLogin(String urlname,String Username) {
		System.out.println("Mobile Login");
		System.out.println(urlname);
		System.out.println(Username);
	}
	@Test
	public void ApiLogin() {
		System.out.println("Rest API Login");
	}
	@BeforeTest
	public void preRequest()
	{
		System.out.println("I will execute first1");
	}

}
