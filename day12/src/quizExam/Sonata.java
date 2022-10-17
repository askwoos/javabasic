package quizExam;

public class Sonata extends Car{
	
	private double totalMileage;
    
	//생성자
	public Sonata(String name, int width, int height, int length, double x, double y, double fuel) {
		super(name, width, height, length, x, y, fuel);
		this.totalMileage = 0.0;
		this.setName("소나타");
	}
   
	 // 기록된 마일리지를 확인 
	public double getTotalMileage() {
		return totalMileage;
	}
	 // 기록된 마일리지를 기록 
	
	public void setTotalMileage(double totalMileage) {
		this.totalMileage = totalMileage;
	}
	
    public void putSpec(){
		
    	
    
		System.out.println("이름:" + name);
		System.out.println("이름:" + name);
		System.out.println("이름:" + name);
		System.out.println("이름:" + name);
		System.out.println("마일리지:" + totalMileage);
		
		
	}


	
	

}
