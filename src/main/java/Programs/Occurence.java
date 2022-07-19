package Programs;

import java.util.HashMap;

public class Occurence {
	
	public static void main(String args[])
	{
		String str = "Sujata Bhadoria";
		char[] chars = str.toCharArray();
	
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c :chars)
		{
			if(hm.containsKey(c))
			{
				int count = hm.get(c);
				hm.put(c, count +1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

}
