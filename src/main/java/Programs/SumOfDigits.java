package Programs;

import java.util.Scanner;

public class SumOfDigits {
	
	public void digitsSum()
	{
		int sum=0; 
		int r;
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt(); //123
		
		while(digit>0)
		{
			r = digit%10; //3 // 2
			sum = sum + r; //3 //5
			digit = digit/10; //12
		}
		System.out.print(sum);
	}
	
	public static void main (String args[])
	{
		SumOfDigits obj = new SumOfDigits();
		obj.digitsSum();
	}

}
