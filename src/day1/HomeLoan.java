package day1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void MobileHomeLoan() {
		System.out.println("1st home loan");
	}
	@Test
	public void MobileBillPay() {
		System.out.println("Pay Bill");
	}
	@Test(dependsOnMethods= {"MobileHomeLoan"})
	public void WebHomeLoan() {
		System.out.println("Web home loan");
	
	}
	@Test(groups={"Smoke"})
	public void MobileRecieveBill() {
		System.out.println("Bill Received");
	}
@BeforeSuite
public void bfSuit() {
	System.out.println("I am number 1");
}
}
