package Programs;

import java.util.Scanner;

public class NPrimeNumbers {
	
   public static void main (String[] args)
   {
       
	   int i,n,counter, j;
	      Scanner scanner = new Scanner(System.in);
	      n=scanner.nextInt();
	     
	      for(i=2; i<=n; i++){
	         counter=0;
	         for(j=1;j<=i;j++){
	            if(i%j==0){
	               counter++;
	            }
	         }
	         if(counter==2)
	         System.out.print(i+" ");
	      }
       
      

   }

}
