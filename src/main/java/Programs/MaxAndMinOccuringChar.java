package Programs;

public class MaxAndMinOccuringChar {
	
	public static void main(String args[])
	{
		String str = "My Name is Sujata Bhadoria";
		char string[] = str.toCharArray();
		
		int freq[] = new int[str.length()];
		char minchar = string[0];
		char maxchar = string[0];
		
		for(int i=0; i<string.length; i++)
		{
			freq[i]=1;
			for(int j=i+1; j<string.length; j++)
			{
				if(string[i]==string[j] && string[i] != ' ')
				{
					freq[i]++;
					string[j] = ' '; // Set string[j] to 0 to avoid printing visited character  
				}
			}
			System.out.println(freq[i]);
		}
		
		int min = freq[0],max = freq[0];
		for(int i=0; i<freq.length; i++)
		{
		if(min>freq[i])
		{
			min=freq[i];
			minchar = string[i];
		}
		
		if(max<freq[i])
		{
			max=freq[i];
			maxchar = string[i];
		}
		}
		
		System.out.println("Minimum occurring character: " + minchar +" and count: " + min);  
        System.out.println("Maximum occurring character: " + maxchar +" and count: " + max);  
	}

}
