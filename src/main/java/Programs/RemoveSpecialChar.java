package Programs;

public class RemoveSpecialChar {
	public static void main(String args[])
	{
		String str = "This#string%contains^special*characters&.";
		System.out.print(str.replaceAll("[^a-zA-Z0-9]", ""));
		
	}
}
