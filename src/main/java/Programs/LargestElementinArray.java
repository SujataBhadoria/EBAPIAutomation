package Programs;

public class LargestElementinArray {
	
	public void largestElement(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);
		
	}
	
	public void largestElementSimple(int arr[])
	{
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	public void SmallestElementSimple(int arr[])
	{
		int min=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.print(min);
	}
	
	
	public static void main(String args[])
	{
		int arr[] = {1,4,8,7,14,3};
		LargestElementinArray la = new LargestElementinArray();
		la.largestElement(arr);
		la.largestElementSimple(arr);
		la.SmallestElementSimple(arr);
	}

}
