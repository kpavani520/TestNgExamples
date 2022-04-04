
import org.testng.Assert;
import org.testng.annotations.Test;

import com.examples.NumberOfDigits;

public class TestNumberOfDigits {

	@Test
	public void test() {
		NumberOfDigits nd = new NumberOfDigits();
		boolean actual = nd.isPalindrome(123);
		Assert.assertTrue(!actual);
	}
}
