package Programs; // Payment Example

public class MethodOverloading {

	public static void main(String args[])
	{
		MethodOverloading m = new MethodOverloading();
		m.upiPayment("s@p", 123);
		m.upiPayment("b@p", "Sujata");
		int a = m.test();
		System.out.println(a);
		String test = m.test1();
		System.out.println(test);
		float f = m.test2();
		System.out.println(f);
	}
	
	void upiPayment(String UPI, int num)
	{
		System.out.println("Phonepe Payment Option "+UPI + num);
	}
	
	void upiPayment(String UPI, String Name)
	{
		System.out.println("Gpay Payment Option "+ UPI + Name);
	}
	
	public void cardPayment(String CT, String CN, int CV)
	{
		String CardType = "Visa";
		String name = "Singh";
		String CardNumber = "1111111111111111111";
		int CVV = 123;
	}
	
	public int test()
	{
		int a=10;
		return a;
	}
	
	public String test1()
	{
		String test="test";
		return test;
	}
	
	public float test2()
	{
		float f = 1.9f;
		return f;
	}
	
	
}
