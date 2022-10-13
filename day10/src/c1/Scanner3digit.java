package c1;
import java.util.Scanner;	// Scanner 클래스 호출


public class Scanner3digit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		int no;
        do {
        	System.out.print("정수입력:");
        	no = sc.nextInt();
        	
        }while(no < 100 || no > 999);
        	
        System.out.println(no);
        	
        // TODO Auto-generated method stub
	}
}
