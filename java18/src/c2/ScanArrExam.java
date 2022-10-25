package c2;
import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class ScanArrExam {

	public static void main(String[] args) {
		
		
		 int[] score = new int[5];


		 Scanner sc = new Scanner(System.in);  // Create a Scanner object
		 
		 System.out.println("몇개짜리 배열을 생성할까요?");	    	 
		 
         int no = sc.nextInt(); 

         
		 System.out.println(no+"개 점수를 입력하세요");	  
		 
		 int[] tmp = new int[no];

		 
	     for(int i =0;i < no ;i++) {
	    	 
	    	 System.out.print("score["+i+"]:");
	    	 
	    	 score[i] = sc.nextInt(); 
	    	 
	     }
	     
	     
	     

		 
		// System.out.println("arr[" + i + "] = " + i);  // Output user input
		    
//	     System.arraycopy( Object src, int 몇번째부터, Object dest, int 대상의 몇번째부터 ,int 몇개를 )
//
//
//	     int srcPos: Object src의 몇 번째 인덱스부터 복사할 것인지
//	     int destPos: Object dest의 몇 번째 인덱스부터 붙여넣기할 것인지
//	     int length: Object src에서 몇 개를 복사할 것인지
//	     int[] arr1 = {10, 20, 30, 40, 50};
//	     int[] arr2 = {1, 2, 3, 4, 5};
//	      
	     
	     System.arraycopy(score, 0, tmp, 0, 55);    // arr1의 index 0에서부터 3개를, arr2의 index 1에서부터 copy
	     // Syst	     System.out.println(Arrays.toString(tmp));

	     System.out.println(Arrays.toString(score));

	     System.out.println(Arrays.toString(tmp));
	     

	             
	}

}
