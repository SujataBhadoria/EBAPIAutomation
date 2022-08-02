package Programs;

public class RemoveCharPresentInSecString {
	
	public static void main(String args[]) {
		String s1 = "india is great";
		String s2 = "in";
		
		
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s2.length(); j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					s1 = s1.replace(s1.charAt(i), '\0');
				}
			}
		}
		
		System.out.print(s1);
}}
