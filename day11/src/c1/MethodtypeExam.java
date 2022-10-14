package c1;
 //입력0 출력0

public class MethodtypeExam {

	 int inputoutput(int a,int b) {
		  return a*b;
	 }
	 
	 void noinput() {
		 
		  System.out.println("--");
	 }
	 
	 
	 String noinputyesoutput() {
		  return "입력x출력0.";
	 
	 }
	 
	 
	 void noinputnooutput() {
		 
		  System.out.println("입력x출력x");
	 }
	
	
		
	
	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
    		
    		MethodtypeExam test = new MethodtypeExam();
    		
    		System.out.println(test.inputoutput(2, 3));
    		
    		test.noinput();
    		test.noinputnooutput();
    		
    		System.out.println(test.noinputyesoutput());
    		
    		
		

	}

}
