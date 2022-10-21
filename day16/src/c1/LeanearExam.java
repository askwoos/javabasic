package c1;

public class LeanearExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수
		int[] arr= {1,2,3,4,5,6};
		
		int head =0;
		int tail = arr.length;
		int center =0;
		
		int val=5;
		
		while(head <= tail) {
			
			center = (head+tail)/2;
			 
			if(arr[center] == val) {
				  System.out.println((center+1)+"번째요소가 일치합니다");
			      break;
			}else if(arr[center] > val) {
		    	  
			 	  tail = center -1;
				  
		    }else{ 
			      head = center +1;
				  		  
			}
			
			if(head <= tail) {
				System.out.println("값을찾을수가 없습니다");
				break;				
			}
			
			  
			
		}
		
		
		
	
		
		

	}//main

}//class
