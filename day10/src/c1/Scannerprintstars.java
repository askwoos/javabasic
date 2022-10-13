package c1;

import java.util.Scanner;

public class Scannerprintstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		int no;
		
		System.out.print("몇개의*를 표시할까요 : ");
		
    	no = sc.nextInt();
    	

		
	    while(no >0) {
	    	
	    	System.out.print("*");
	    	no--;
	    	
	    }
	    
    	System.out.println();
    	System.out.print("줄바꿈");

    	

	    
	}

}
