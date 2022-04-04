
public class SwapingTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Pavani";
		String s2="katragadda";
		/*String temp="";
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println(s1);
		System.out.println(s2);*/
		s1=s1+s2;//pavanikatragadda
		s2=s1.substring(0, 6);
		//s2 = s1.substring(0, s1.length() - s2.length());
		s1=s1.substring(6);
		//s1 = s1.substring(s2.length());

		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);		

	}

}
