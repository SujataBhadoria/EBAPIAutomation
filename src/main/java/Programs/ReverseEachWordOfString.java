package Programs;

public class ReverseEachWordOfString {
	
	public static void main(String args[]) {
		
		String str = "Java is a good programming language";
		String split[] = str.split(" ");
		String rev="";
		
		for(String s : split)
		{
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			rev = rev + sb.toString()+" ";
		}
		System.out.print(rev);
	}

}
