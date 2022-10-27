package exam1;
import java.util.*;


public class setExam {
	
	
      public static void main(String[] args) {
    	  
 		
  		HashSet<String> hSet = new HashSet<String>();

  		
  		// 값 추가
  		hSet.add("e");
  		hSet.add("c");
  		hSet.add("g");
  		hSet.add("f");
  		hSet.add("d");
  		
  		hSet.add("d");


[출처] JAVA - 자료구조(Set)|작성자 유년준
    	  
 		 

  		hSet.forEach(System.out::print);
    	   
    	  
    	  
		
	}

}
