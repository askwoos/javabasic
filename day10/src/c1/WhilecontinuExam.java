package c1;

public class WhilecontinuExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a가 짝수면 다시 while문 테스트 
		
		int a = 0;
		int sum =0;
		System.out.println(a);

		
		while(true) {
			a++;	
			
			System.out.println(a);
			
			if(a >=1000) {
			    break; 
			}	
			else if(a%3 ==0){
					sum = sum +a;
			}
				
			System.out.println(sum); 
		}
		
	}

}
