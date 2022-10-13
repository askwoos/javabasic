package c1;

public class Whilebreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int coffee = 10;
		int money = 300;
		
		while(true) {
		
			System.out.println("돈받고 커피준다");
			coffee--;
			System.out.println("남은 커피는"+ coffee );
			
			//무한루프는 탈출 
			if(coffee ==0) {
				System.out.println("남은 커피가 없습니다"+ coffee );
				break;
				
			}
			
		}

	}

}
