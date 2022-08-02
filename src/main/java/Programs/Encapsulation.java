package Programs;

public class Encapsulation {
	
	private int emp_id;
	
	public static void main(String args[])
	{
		Encapsulation emp = new Encapsulation();
		emp.setEmployeeId(10);
		emp.getEmployeeId();
	}
	
	public void setEmployeeId(int empid)
	{
		this.emp_id = empid;
	}
	
	public int getEmployeeId()
	{
		System.out.println(emp_id);
		return emp_id;
	}
}
