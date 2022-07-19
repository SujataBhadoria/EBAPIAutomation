package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String args[]) {
		UsingArraySort();
		UsingCollection();
		sorting();
		
	}
	
	public static void UsingArraySort()
	{
		int array[] = {1,2,3,4,5,6};
		Arrays.sort(array);
		for(int i=array.length-1; i>0; i--)
		{
			System.out.println(array[i]);
		}
	}
	
	public static void UsingCollection()
	{
		Integer array[] = { 1, 2, 3, 4, 5 };
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}
	
	public static void sorting()
	{
		int array[] = {1,2,3,4,5,6};
		int temp;
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]<array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
