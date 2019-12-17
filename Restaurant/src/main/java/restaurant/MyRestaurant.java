package restaurant;

public class MyRestaurant {
	
	private static String question = "There is no recommendations for you currently in our DB. Would you like to enter another food?";
	private String foodTypes;
	
	public String getQuestion() {
		
		return question;
	}

	public String askFood(String faveFood) {
		// TODO Auto-generated method stub
		switch (faveFood) {
		
		case "pasta":
			this.foodTypes = "Italian";
			return "Do you like " + this.foodTypes + " food?";
		
		case "burgers":
			this.foodTypes = "American";
			return "Do you like " + this.foodTypes + " food?";
		
		case "tacos":
			this.foodTypes = "Mexican";
			return "Do you like " + this.foodTypes + " food?";
		
		case "curry":
			this.foodTypes = "Indian";
			return "Do you like " + this.foodTypes + " food?";
		
		default:
			return question;
		}
	}

	public String boolAns(String string) {
		// TODO Auto-generated method stub
		
		if (string.equals("yes")) {
			return "The best " + this.foodTypes + " restaurant";
		}
		return "Please enter another dish";
	}
	
	public String boolAnsTwo(String string) {
		// TODO Auto-generated method stub
		
		if (string.equals("yes")) {
			return "please enter another dish";
		}
		return "Bye Bye";
	
	}
	

}
