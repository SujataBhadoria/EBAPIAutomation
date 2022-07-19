package Programs;

public class Encapsulation {
	
	private int emp_id;
	
	public static void main(String args[])
	{
		Encapsulation ep = new Encapsulation();
		ep.setEmployeeID(10);
		System.out.println(ep.getEmployeeID());
	}
	
	public void setEmployeeID(int eid)
	{
		emp_id = eid;
	}
	
	public int getEmployeeID()
	{
		return emp_id;
	}
}
