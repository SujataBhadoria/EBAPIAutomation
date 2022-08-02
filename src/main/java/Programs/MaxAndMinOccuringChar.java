package Programs;

public class MaxAndMinOccuringChar {
	
	public static void main(String args[])
	{
		String str = "My Name is Sujata Bhadoria";
		char string[] = str.toCharArray();
		int freq[] = new int[str.length()];
		
		for(int i=0; i<str.length(); i++)
		{
			freq[i]=1;
			for(int j=i+1; j<str.length(); j++)
			{
				
				if(string[i]==string[j] && string[i]!= ' ')
				{
					freq[i]++;
					string[j]=0;
				}
			}
		}
		
		char maxchar = string[0];
		char minchar = string[0];
		int max = freq[0];
		int min = freq[0];
		
		for(int i=0; i<freq.length; i++)
		{
			if(freq[i]>max)
			{
				max = freq[i];
				maxchar = string[i];
			}
		}
		
		for(int i=0; i<freq.length; i++)
		{
			if(freq[i]<min)
			{
				min = freq[i];
				minchar = string[i];
			}
		}
		
		System.out.println("Count of max occuring char " + maxchar +" is "+ max);
		System.out.println("Count of min occuring char " + minchar +" is "+ min);
	}

}
