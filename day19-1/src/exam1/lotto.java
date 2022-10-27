package exam1;
import java.util.*;




public class lotto {

	public static void main(String[] args) {
		
		
		
		 int lottonum[] = new int[46];
		 int winnum[] = new int[6];
		 int winnum2[] = new int[6];

		 
		 for(int i=0;i<= 45;i++) {
			 
			 lottonum[i] =  (int)(Math.random()*46);			 
		 }
		 
	 //	   System.out.println(Arrays.toString(lottonum));  
          
		   for(int i=0;i< 6;i++) {
				 
			   winnum[i] =  (int)(Math.random()*46);	
		 }
		   
		   
		  System.out.println("오늘의 추천번호는\n"+ Arrays.toString(winnum));
		  
		  HashSet<String> set = new HashSet<>();
		  
		  while(true) {
			  set.add();
			  
		  }
		  
		  (Math.random()*45)+1)
		  
		  
//		  for(int j=0;j<6;j++) {
//			  winnum2[j] = (int)(Math.random()*46);	
//		  }
//		  
		  
		  System.out.println(set);
		  
		  
		  
		  
		   
		   
		   
	}

}
