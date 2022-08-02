package Programs;

import java.util.regex.Pattern;

public class CheckAlphanumeric {
	
	public static void main(String args[])
	{
		String str = "hfghfgh54546";
		char Char[] = str.toCharArray();
		String regex ="^[a-zA-Z0-9]*$";
		Pattern pat = Pattern.compile(regex);
		boolean result = pat.matcher(str).matches();
		
		int sum = 0; 
		
		if(result==true)
		{
			for(int i =0; i<str.length(); i++)
			{
				char c = str.charAt(i);
				if(Character.isDigit(c))
				{
					sum = sum+Character.getNumericValue(c);
				}
			}
			System.out.print(sum);
		}
		else
		{
			System.out.print(str +" is not an alphanumeric");
		}
	}

}
