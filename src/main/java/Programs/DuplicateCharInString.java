package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateCharInString {
	
		public static void dupChar() {
		String str = "Sujattas";
		for(int i = 0; i<str.length(); i++)
		{
			for (int j=i+1; j<str.length(); j++)
			{
				if(str.toLowerCase().charAt(i)==str.toLowerCase().charAt(j))
				{
					System.out.print(str.charAt(j));
				}
			}
		}
		System.out.println();
		}
		
		public static void dupArray() {
			int a[] = {1,2,1,3,4,2,3,6,6};  
			for(int i = 0; i<a.length; i++)
			{
				for (int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						System.out.print(a[j]);
					}
				}
			}
			System.out.println();
		}
		
		public static void dupWordinString() {
			String str = "My name is Sujata Sujata";
			String str1[] = str.split(" ");
			
			for(int i=0; i<str1.length; i++)
			{
				for(int j=i+1; j<str1.length; j++)
				{
					if(str1[i].equalsIgnoreCase(str1[j]))
						{
						System.out.print(str1[j]);
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
