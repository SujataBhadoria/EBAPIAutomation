package Programs;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 5
		int fac = num;
		
		for(int i =num; i>=2; i--)
		{
		fac = fac * (num-1);
		num--;
		}
		System.out.println("Factorial is " + fac);
	}

}
