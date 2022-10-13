package c1;
import java.util.Scanner;


public class Addnumber1to10 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	   int i=0;
	   int no = 0;
	   int sum =0;
	   
       Scanner sc = new Scanner(System.in);
	   System.out.print("정수를입력:");

       no = sc.nextInt();
       
       while(i < no) {
    	   
   		 if(i%2 == 0) {
   	    	 System.out.print("*");

   		 }else{
   			 
   	    	 System.out.print("+");

   		 }
   		 
         i++;    	  
         
       }
       
              
		System.out.println("sum : "+sum);
	}

}
