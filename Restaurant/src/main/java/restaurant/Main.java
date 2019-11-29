package restaurant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		MyRestaurant res = new MyRestaurant();
		String question = res.askFood("burgers");
		
		if (question.equals(res.getQuestion())) {
			
			res.boolAnsTwo(scan.nextLine());
		}
		else {
			
			res.boolAns(scan.nextLine());
			scan.close();
		}

	}

}