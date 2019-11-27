package main;

public class Results {
	
	static int physics = 30;
	static int chemistry = 134;
	static int biology = 21;
	static int total;
	static float percentage;	
	
	static int results(int physics, int chemistry, int biology) {
		 
		total = physics + chemistry + biology;
		
		System.out.println("The Physics score is " + physics + "/150");
		System.out.println("The Chemistry score is " + chemistry + "/150");
		System.out.println("The Biology score is " + biology + "/150");
		System.out.println("\nThe total score is " + total + "/450");
		
		return total;
	}
	
	static void displayPercentage(int total) {
		
		boolean failPhys = physics < (0.6*150);
		boolean failChem = chemistry < (0.6*150);
		boolean failBio = biology < (0.6*150);
		
		int failCounter = 0;
		
		//cast total to a float 
		percentage = ((float) total * 100) / 450;
		
		System.out.println("The percentage is " + percentage + "%");
		
		if (failPhys == true) {
			failCounter += 1;
		}
		
		if (failChem == true) {
			failCounter += 1;
		}
		
		if (failBio == true) {
			failCounter += 1;
		}

		
		if (chemistry < (0.6*150) || physics < (0.6*150) || biology < (0.6*150) && failCounter > 0) {
			System.out.println("\nlel, you failed bruv. you failed " + failCounter + " subject(s)");
		}
		else {
			System.out.println("\nYou failed, try again and get above 60% you nerd");
		}
	}
		
	public static void main(String[] args) {
		
		int total = results(physics, chemistry, biology);
		displayPercentage(total);
			
	}
			

}
