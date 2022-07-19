package Programs;

public class ArmstrongNumber {
	public static void main(String args[]) {
		
	int num = 253;
	int temp = num;
	int arm = 0;
	
	while(temp>0)
	{
		int r = temp%10;
		arm = arm + (r*r*r);
		temp = temp/10;
	}
	System.out.println(arm);
	
	if(num == arm)
	{
		System.out.print("Armstrong Number");
	}
	else
	{
		System.out.print("Not Armstrong Number");
	}
	}
}
