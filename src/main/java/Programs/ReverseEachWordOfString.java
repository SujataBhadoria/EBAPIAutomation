package Programs;

public class ReverseEachWordOfString {
	
	public static void main(String args[]) {
		
		String str = "Java is a good programming language";
		String words[] = str.split(" ");
		String revword = "";
		
		for(String w: words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			revword = revword + sb.toString()+" ";
		}
		System.out.print(revword);
	}

}
