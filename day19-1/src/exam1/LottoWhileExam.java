package exam1;
import java.util.*;
import java.util.Scanner;


public class LottoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.print("요소 수: ");
		int num = sc.nextInt();
		
		
		
		for(int i=0;i<num;i++) {
			int rn = rnd.nextInt(10);
			arr.add(rn);
			System.out.println("a["+i+"]="+arr.get(i));
		}
	
	}

}

