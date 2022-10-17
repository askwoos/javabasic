package c2;

public class Dog extends Animal {
	
	void sleep() {
		
		System.out.println(this.name + "zzz");
		
	}
	
    void sleep(int hour) {
		
		System.out.println(this.name + "zzz" + hour + "hours");
		
	}
    
   void sleep(int hour,int min) {
		
		System.out.println(this.name + "zzz" + hour + "hours" + min + "min");
		
		
	}

	

}
