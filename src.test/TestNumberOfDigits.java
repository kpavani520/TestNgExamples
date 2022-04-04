
import org.testng.Assert;
import org.testng.annotations.Test;

import com.examples.NumberOfDigits;

public class TestNumberOfDigits {
	NumberOfDigits nd = new NumberOfDigits();

	@Test
	public void test() {
		
		boolean actual = nd.isPalindrome(123);
		Assert.assertTrue(!actual);
	}
	
	@Test
	public void reverseTest() {
		int result=nd.reverseNum(123);
		Assert.assertEquals(result, 321);
		
	}
}
