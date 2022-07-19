package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateFromArray {
	
	public static void main(String args[]) {
		removeDuplicateArray();
		removeDuplicateStringArray();
	}
	
	public static void removeDuplicateArray() 
	{
		int array[] = {8,8,5,4,5,2,3,5,2};
		
		ArrayList<Integer> withduplicate = new ArrayList<Integer>();
		for(int a : array)
		{
			withduplicate.add(a);
		}
		
		LinkedHashSet set = new LinkedHashSet(withduplicate);
		ArrayList<Integer> withoutduplicate = new ArrayList<Integer>(set);
		System.out.println(withoutduplicate);
		
	}
	
	
	public static void removeDuplicateStringArray() {
		
		String[] str = {"Sujata", "Vaibhav", "Sumit", "Sushant", "Vaibhav"};
		List<String> withduplicate = Arrays.asList(str);
		
		LinkedHashSet set = new LinkedHashSet(withduplicate);
		
		ArrayList<Integer> withoutduplicate = new ArrayList<Integer>(set);
		System.out.print(withoutduplicate);
		
	}
}
