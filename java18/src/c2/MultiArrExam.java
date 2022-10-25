package c2;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrExam {

	public static void main(String[] args) {
		

	    int[] score = new int[5];
		
		
		 Scanner sc = new Scanner(System.in);  // Create a Scanner object
		 
		 System.out.println("사람수를 입력하세요");	    	 
		 
         int no = sc.nextInt(); 
         
         System.out.println(no+"개 점수를 입력하세요");	  
		 
         int sum =0;
         int max =0;
		 double avg =0.0;
		 
	     for(int i =0;i < no ;i++) {
	    	 
	    	 score[i] = sc.nextInt(); 
	    	 
	    	 sum = sum + score[i];
	    	 if(max <score[i]) {
	    		 max = score[i];
	    		  
	    	 }
	    	
	     }
	     
	     avg = sum /no;
	        System.out.println(Arrays.toString(score));
	        System.out.println("합계는 "+ sum + "점입니다");
	        System.out.println("평균은 "+ avg + "점입니다");
	        System.out.println("최고점은 "+ max + "점입니다");
	        

	     
    	// System.out.print("score["+i+"]:");

	
//		for(int i =0;i<2;i++) {
//			
//			for(int j=0;j<3;j++) {
//				
//				System.out.println("score["+i+"]["+j+"]="+score[i][j]);
//
//			}//for j
//		}//for i
//
//		System.out.println(Arrays.deepToString(score));
//	
//	  
//	
//	
	
	
	}//main 

}
