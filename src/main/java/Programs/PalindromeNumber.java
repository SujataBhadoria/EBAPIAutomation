package Programs;

public class PalindromeNumber {
	
	public static void main(String args[])
	{
		int num =34543;
		int temp =num;
		int r;
		int sum=0;
		
		while(temp>0)
		{
			r = temp%10; //1
			sum = (sum*10) + r; //1
			temp = temp/10; //12
		}
		
		System.out.println(num);
		System.out.println(sum);
		
		if(num==sum)
		{
	System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
}
}