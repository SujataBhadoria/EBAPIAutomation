package Programs;

public class SuperAndThis1 extends A
{
  int a = 20;
  
  void show(int a)
  {
	  System.out.println(a);
	  System.out.println(this.a);
	  System.out.println(super.a);
  }
  
  
  
  public static void main(String args[])
  {
	  SuperAndThis1 st = new SuperAndThis1();
	  st.show(1);
	  
  }
}
