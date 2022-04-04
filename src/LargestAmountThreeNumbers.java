
public class LargestAmountThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {18,16,14};
		if(n[0]>n[1] && n[0]>n[2]) {
			System.out.println(n[0]+" is the greatest number");
			}
		else if(n[1]>n[2]) {
		
			System.out.println(n[1]+" is the greatest number");
		}
		else
			System.out.println(n[2]+" is the greatest number");

	}

}
