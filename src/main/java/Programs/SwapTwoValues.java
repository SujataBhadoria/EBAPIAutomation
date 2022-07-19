package Programs;

public class SwapTwoValues {
	
	public void swap()
	{
	int a = 2;
	int b = 8;
	
	int temp;
	
	temp = a;
	a = b;
	b = temp;
	System.out.println(a + " "+ b);
	}
	
	public void swap1()
	{
		int a = 2;
		int b = 8;
		
		int temp;
		a = a+b; //10
		b = a-b; //2
		a = a-b; //8
		System.out.println(a + " "+ b);
	}
	
	public static void main(String args[])
	{
		SwapTwoValues stv = new SwapTwoValues();
		stv.swap();
		stv.swap1();
	}
}
