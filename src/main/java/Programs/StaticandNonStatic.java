package Programs;

public class StaticandNonStatic {
	
	static int age; // static varb
	String name; // non static varb
	
	
	public static void main(String args[])
	{
		// static int i = 10; (static related to class only local varb not possible
		
		//how to access non-static varbs and mtds
		//we have to create obj of the class
		
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.name = "Sujata"; // accessing non static varb
		System.out.println(obj.name);
		obj.getname(); // accessing non static mtd
		System.out.println(obj.age); //accessing static varb
		obj.getInfo(); // accessing static mtd
		
		//how to access static varbs and mtds
		//we can call them directly : No need to use obj
		
		age = 25; // direct call
		System.out.println(age);
		StaticandNonStatic.age = 28; //using classname
		System.out.println(age);
		getInfo(); // direct call
		StaticandNonStatic.getInfo(); //using classname
		
		//3. Can I use obj to call static varbs and methods
		System.out.println(obj.age); //Yes but it will give warning
		obj.getInfo(); // accessing static mtd
		
	}

	public static void getInfo() // static mtd
	{
		System.out.println("get info");
	}
	
	public void getname() // non static mtd
	{
		System.out.println("get name");
	}
}
