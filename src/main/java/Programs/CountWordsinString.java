package Programs;

public class CountWordsinString {
	
	public void countwords()
	{
		String str = "My Name is Sujata aa bb cc";
		String split[] = str.split(" ");

		int count = split.length;
		System.out.println(count);
	}

	public static void main(String args[]) {
		CountWordsinString obj = new CountWordsinString();
		obj.countwords();
	}
}
