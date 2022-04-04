
public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 9,num2=12,gcd=1;
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==00 && num2%i==0) {
				gcd = i;
			}
		}
		int result = (num1 * num2)/gcd;
		System.out.println(result);

	}

}
