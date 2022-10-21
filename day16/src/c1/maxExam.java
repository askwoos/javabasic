package c1;

public class maxExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int arr[]= {3,13,44,51};
	   int max =0;
	   
	   for(int i=0;i < arr.length;i=i+1) {
			
			if( arr[i] > max ) {
				max = arr[i];
				System.out.println(i);
				System.out.println("arr length"+arr.length);
			}		 
		}
		System.out.println(max);
		

	}

}
