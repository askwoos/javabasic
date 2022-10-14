package c1;

class Calculator {
	
	  int result = 0;
	 
	  int add(int num) {
		 
		 result += num;
		 return result;
		 		
	  }//add
	  
	  int sub(int num) {
			 
			 result -= num;
			 return result;
			 		
	  }//add
	  
	 
}

class Calculator2 {
	
	  static int result = 0;
	 
	  static int add(int num) {
		 
		 result += num;
		 return result;
		 		
	  }//add
	  
	  int sub(int num) {
			 
			 result -= num;
			 return result;
			 		
	  }//add
	  
	 
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();

		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println();
		
		System.out.println(cal2.add(1));
		System.out.println(cal2.add(2));
		
		
		System.out.println(cal2.sub(1));
		System.out.println(cal2.sub(2));
		
		System.out.println(Calculator2.add(2));
		

		

	}

}

