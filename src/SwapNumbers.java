
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int temp;
		/*temp = a;
		a = b;
		b = temp;
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);*/
		a = a-b;//1-20=-10
		b=a+b;//-10+20=10
		a=b-a;//10+10=20
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
		

	}

}
