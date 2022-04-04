
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOrOdd eo=new EvenOrOdd();
		eo.number(-23);
	}
public void number(int num) {
	int n = num%2;
	if(n == 0) {
		System.out.println(num+"The number is even");
	}
	else
	{
		System.out.println(num+"The number is odd");
	}
}

}
