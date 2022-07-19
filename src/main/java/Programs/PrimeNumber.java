package Programs;

public class PrimeNumber {
	
	
	public static void main(String args[])
	{
		int number = 43;
		boolean flag = false;
		for(int i = 2; i<=number/2; i++)
		{
			//System.out.println(number%i);
			if((number%i)==0)
			{
				flag = true;
				break;
			}
			
		}
		
		if (flag==true)
		{
			System.out.print("Not Prime");
		}
		else
		{
			System.out.print("Prime");
		}
}}
