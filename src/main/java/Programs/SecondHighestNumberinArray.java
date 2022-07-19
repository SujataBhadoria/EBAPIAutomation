package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumberinArray {
	
	public static void SHUsingArrays(int a[])
	{
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
		String str[] = {"Sujata", "Vaibhav", "Sumit", "Sushant"};
		Arrays.sort(str);
		for(String s: str)
		{
		System.out.println(s);
		}
	}
	
	public static void SHUsingCollections()
	{
		Integer a[]= {8,5,9,13,3,0};
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
	}
	
	public static void SHUsingTemp(int a[])
	{
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i]; //temp = 8
					a[i] = a[j]; //a[i] = 5
					a[j] = temp; // a[j] = 8
				}
			}
		}
		System.out.println(a[a.length-2]);
	}
	
	public static void main(String args[]) {
		int a[]= {8,5,9,13,3,0};
		SHUsingArrays(a);
		SHUsingCollections();
		SHUsingTemp(a);
	}

}
