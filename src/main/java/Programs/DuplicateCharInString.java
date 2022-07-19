package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateCharInString {
	
		public static void dupChar() {
		String str = "Sujattas";
		char[] chars = str.toLowerCase().toCharArray();
		
		for(int i = 0; i<chars.length; i++)
		{
			for (int j = i+1; j<chars.length; j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println(chars[j]); 
				}
			}
		}}
		
		public static void dupArray() {
			int a[] = {1,2,1,3,4,2,3,6,6};  
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i] == a[j])
					{
						//List<Integer> list =  Arrays.asList(a[j]);
							System.out.println(a[j]);
					}
				}
			}
			
		}
		
		public static void dupWordinString() {
			String str = "My name is Sujata Sujata";
			String[] split = str.split(" ");
			
			for(int i=0; i<split.length; i++)
				{
				for(int j=i+1; j<split.length; j++)
				{
					if(split[i].equals(split[j]))
					{
						System.out.println(split[j]);
					}
				}
				}
			
		}
		
		public static void main(String args[]) {
			dupChar();
			dupArray();
			dupWordinString();
	}

}
