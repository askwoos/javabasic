package c2;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
//		   Dog dog = new Dog();
//           dog.setName("poppy");
//           System.out.println(dog.name);
//           dog.sleep();
		   Housedog houseDog = new Housedog("happy");
           
		   houseDog.sleep();//아버지 기능
		   houseDog.sleep(5);//아버지 기능 
		   houseDog.sleep(5,6);//아버지 기능 
		   
		   System.out.println(houseDog.name);
		   
		   Housedog houseDog1 = new Housedog("happy");
		   Housedog houseDog2 = new Housedog(1);
		   
		   
		   
          		   
		   
	}
}
