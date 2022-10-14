package c1;

public class Otherreturn {
	
   void sayNick(String nick) {
	   
	   if("fool".equals(nick)) {
		   System.out.println(nick);

		   return;
		   
	   }
	   
	   System.out.println("나의 별명은" +nick);
	   
   }
	
	
	public static void main(String[] args) {
		
		Otherreturn sample = new Otherreturn();
		
		sample.sayNick("fool");
		
		
		
		
	}

}
