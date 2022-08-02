package Programs;

public class NumberOfDigits {
	public static void main(String args[]) {
		int num = 3458;
		int digit = 0;
		
		while(num>0)
		{
			digit++;
			num = num/10;
		}
		
		System.out.print(digit);
	}}
