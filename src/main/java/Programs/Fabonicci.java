package Programs;

public class Fabonicci {
	
	public static void main(String args[])
	{
		int n1=0;
		int n2=1;
		int n3=1;
		int num = 10;
		int n4;
		
		System.out.print(n1+" "+n2+" "+n3+" ");
	
		for (int i=3; i<=num; i++)
		{
			n4 = n1+n2+n3; // n3=1
			System.out.print(n4+ " ");
			n1 = n2;// n1= 1
			n2 = n3;// n2 = 1
			n3 = n4;
		}
	
	}

}
