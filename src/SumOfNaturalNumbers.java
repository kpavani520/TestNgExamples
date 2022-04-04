
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		int sum = 0;
		int sum1 = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("sum = " + sum);

		System.out.println("-------");
		int k = 1;
		while (k <= 100) {
			sum1 = sum1 + k;
			k++;
		}
		System.out.println("sum = " + sum1);
	}

}
