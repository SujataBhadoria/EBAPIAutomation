package Programs;

public class StringReverse {
	
	public void reverseInBuilt()
	{
		String str = "Automation";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	
	public void reversecharArray()
	{
		String str = "Automation";
		char array[] = str.toCharArray();
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.print(array[i]);
		}
	}
	
	public void reverseString()
	{
		String str = "Automation";
		String split[] = str.split("");
		for(int i=split.length-1; i>=0; i--)
		{
			System.out.print(split[i]);
		}
	}
	
	public static void main(String args[])
	{
		StringReverse sr = new StringReverse();
		sr.reverseInBuilt();
		sr.reversecharArray();
		sr.reverseString();
	}

	
}
