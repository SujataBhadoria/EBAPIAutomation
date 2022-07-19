package Programs;

public class SumOfArrays {
		
		public static void main(String args[])
		{
			int a[] = {1,2,3,4,6};
			int sum = 0;
			
			for(int arr : a)
			{
				sum = sum + arr;
			}
			System.out.print(sum);
		}

}
