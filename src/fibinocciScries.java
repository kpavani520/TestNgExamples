
public class fibinocciScries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		int count=10;
		System.out.println(n1+""+ n2);
		int n3;
	for(int i=2;i<=count;i++) {
	n3= n1+n2;
	System.out.println(n3);
	n1=n2;
	n2=n3;
	}
	}

}
