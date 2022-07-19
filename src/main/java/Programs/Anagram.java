package Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String args[])
	{
		String s1 = "Army";
		String s2 = "Mary";
		
		char c1[] = s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);
		
		char c2[] = s2.toLowerCase().toCharArray();
		Arrays.sort(c2);
		System.out.println(c2);
	
		if (Arrays.equals(c1, c2))
		{
		System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}