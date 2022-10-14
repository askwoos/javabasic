package c1;

class Animal {

	String name;
	
	public void setName(String name) {
		
		
		this.name = name;
		
	}
	
	
    public int calsum(int a,int b) {
		
		return a + b;
		
	}
	
  
	
	
}



public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cat = new Animal();
		
		System.out.println(cat.name);
		
		cat.setName("boby");
		
		System.out.println(cat.name);
		
		cat.setName("honey");
		
		System.out.println(cat.name);
		
		
		System.out.println(cat.calsum(3, 4));
	

			
		//cat 인스턴스는 Animal클래스로만들었다.   cat 인스턴스의 자료형은 Animal 
		
		
		
		

	}

}
