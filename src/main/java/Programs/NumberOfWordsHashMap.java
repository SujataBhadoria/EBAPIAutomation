package Programs;

import java.util.HashMap;

public class NumberOfWordsHashMap {
	
	public static void main(String args[]) {
	
		String str = "My name is Sujata Bhadoria Sujata";
		String split[] = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String s : split)
		{
			if(hm.containsKey(s))
			{
				int count = hm.get(s);
				hm.put(s, count+1);
			}
			else
			{
				hm.put(s, 1);
			}
			
		}
		
	System.out.print(hm);
	
	
	}
}
