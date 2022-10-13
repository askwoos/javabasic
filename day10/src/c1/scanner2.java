package c1; 

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		int no;
		int temp;
		int count = 0;
		
    	System.out.println("카운트다운합니다.");

    	
        do {
        	
        	System.out.print("양의정수값 :");
        	
        	no = sc.nextInt();
        	count = no;
        	
        	
        }while(no <= 0);
        
        
        while(no >=0) {
        	System.out.println(no);
        	no--;
        	
        }
        
        System.out.println("x값이"+no+"가 됐습니다");
        
        
        
        
        	
        
        

	}

}
