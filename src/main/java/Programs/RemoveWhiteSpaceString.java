package Programs;

public class RemoveWhiteSpaceString {
	
	public static void removeUsingReplace()
	{
		String str = "My name is Sujata";
		String str1 = str.replace(" ", "");
		System.out.println(str1);
	}

	public static void removeWithoutReplace()
	{
		String str = "My name is Sujata";
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : chars)
		{
			if(c!=' ')
			{
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
	
	public static void main(String args[]) {
		removeUsingReplace();
		removeWithoutReplace();
	}
}
