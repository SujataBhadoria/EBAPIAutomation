package Programs;

public class Car extends Inheritance{
	
	int engine = 2;
	
	@Override
	public void Start()
	{
		System.out.println("Car--Start");
	}
	
	public void Stop()
	{
		System.out.println("Car--Stop");
	}
	
	public void Refuel()
	{
		System.out.println("Car--Refuel");
	}
	
	public void Automatic()
	{
		System.out.println("Car--Automatic");
	}
	
	public static void main (String args[])
	{
		Car c = new Car();
		c.Start();
		c.Stop();
		c.Refuel();
		System.out.println(c.engine);
		
		Inheritance i = new Inheritance();
		i.Start();
		i.Stop();
		i.Refuel();
		System.out.println(i.engine);
		
		Inheritance I1 = new Car();
		I1.Start();
		
		
	}

	
}
