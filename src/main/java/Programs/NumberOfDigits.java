package Programs;

public class NumberOfDigits {
	public static void main(String args[]) {
		
		int num = 123;
		int digit = 0;
		
		while(num>0)
		{
			num = num/10;
			digit++;
			
		}
		System.out.println(digit);
	}

}
