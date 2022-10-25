package c2;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
//        String str= "SDF";
//        
// 		int[] score = {50,60,70,80,90};
// 		
//		
//		for(int i=0;i<score.length;i++) {
//			
//			System.out.println("score["+i+"]:"+score[i]);
//			
//		}
//		
//		int x = str.length();
//		System.out.println(x);
//		
		
		//배열 복사하기 
	
		
		
		
		int[] score = {50,60,70,80,90};
		
		
        System.out.println(Arrays.toString(score));
	
        int[] tmp = new int[score.length*2];
        
        score = tmp;
        
        System.out.println(Arrays.toString(tmp));
        
        for(int i =0;i <score.length;i++) {
        	
        	tmp[i] = score[i];
        	
        }
          
        System.out.println(Arrays.toString(score));
        
        
	//
	//	int[] tmp = new int[arr.length*2];
		
	//	arr = tmp; //기존 참조 배열 변수 arr이 새로운 배열을 가르키도록 한다.
		
		
		
		
		
		
		
	}

}
