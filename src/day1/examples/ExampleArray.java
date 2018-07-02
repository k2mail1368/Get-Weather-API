package day1.examples;

public class ExampleArray {

	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6,};

		System.out.println(a[2] + " " + a[4]);
		
		for(int temp : a) {
			System.out.println(temp);
		}
		
		int [] x = new int [5];
		
		x[2]=30;
		x[4] = 40;
		System.out.println(x[2] + " " + x[4]);
		
		for (int temp2 : x) {
			System.out.println(temp2);
		}
		String [] stx = new String [5];
		stx[3] = "Three";
		stx[4] = "Four";
		for(String temp : stx) {
			System.out.println(temp);
			
		}
	}
	
	

}
