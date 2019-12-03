package main;

public class ArrayExOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			
			intArray[i] = i + 1;
			
		}
		
		for (int j = 0; j < intArray.length; j++) {
			
			System.out.print("\t" + intArray[j]);
			System.out.println("\t" + intArray[j]*10);
		}
		

	}

}
