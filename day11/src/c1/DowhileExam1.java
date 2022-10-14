package c1;
import java.util.Scanner;

public class DowhileExam1 {

	
	public void method00() {
		
	      System.out.println("인수도 리턴값도 없습니다");
	}
	
	
	
	
	public void inject(int a) {
		
	      String checkAgeDiscount ="";
	      
          System.out.println("주사"+a+"대 맞았습니다");	      
	      
	}
	
	public int getValuse9() {
		
	      String checkAgeDiscount ="";
	              
	      return 9;

	      
	}
	
	
	public String discount(int a) {
		
	      String checkAgeDiscount ="";
	      
		  if(a >= 60) {
			  checkAgeDiscount ="할인";	  
		  }
	      
	      return checkAgeDiscount;
	      
	}
	
		
//	
//	public method01{int x){
//      
//      System.out.println("인수를 db에 입력했습니다");
//      
//		
//	}
//	
//	public method10(){
//		
//	}
//	public method11(){
//	
//    }
//    

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DowhileExam1 sample = new DowhileExam1();

		String result = "";
		
		sample.method00();
		
		result = sample.discount(165);
		
		System.out.println(result);
		
		sample.inject(7);
		
		int nine = sample.getValuse9();
		
		System.out.println(nine);
		

		
		
//		final double PI = 3.14;
//		
//		int radius = 5;
//	    double result = radius * 2 * PI;
//	    System.out.println(result);        
//	        

//	        
		
				
//		Scanner scan = new Scanner(System.in);
//		
//		int value =0;
//		int sum = 0;
//		
//		do {
//			
//			value =scan.nextInt();
//			sum = sum + value;
//			
//		}while(value <= 100);
		
//		
//		String str1 ="hello";
//		String str2 ="hello";
//		
//		
//		String str3 = new String("hello");
//		String str4 = new String("hello");
//		
//		
//		if(str1.equals(str4)){
//			
//			System.out.println("1,4같다");
//			
//		}
//		
//		if(str3.equals(str4)){
//			
//			System.out.println("3,4같다");
//			
//		}
//		
//		
//				
//		System.out.println("끝");


	}

}
