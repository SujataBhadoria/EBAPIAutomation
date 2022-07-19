package Programs;

public class ReverseWordsonPlace {
	
	public static void main(String args[])
	{
		String str = "This is the string to reverse";
		String[] split = str.split(" ");
		String revstr = "";
		
		for(int i= split.length-1; i>=0; i--)
		{
			revstr = revstr + split[i]+" ";
		}
		System.out.print(revstr);
	}

}
