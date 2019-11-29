package restaurant;

import org.junit.*;

public class RestaurantTest {

	@Test
	public void italianTest() {
		//fail("Not yet implemented");
		
		MyRestaurant res = new MyRestaurant();
		
		String faveFood = res.askFood("pasta");
		Assert.assertEquals("Do you like Italian food?", faveFood);
		
		String myRes = res.boolAns("yes");
		Assert.assertEquals("The best Italian restaurant", myRes);
		
		String myRes2 = res.boolAns("no");
		Assert.assertEquals("Please enter another dish", myRes2);
	}
	
	@Test
	public void americanTest() {
		//fail("Not yet implemented");
		
		MyRestaurant res = new MyRestaurant();
		
		String faveFood = res.askFood("burgers");
		Assert.assertEquals("Do you like American food?", faveFood);
		
		String myRes = res.boolAns("yes");
		Assert.assertEquals("The best American restaurant", myRes);
		
		String myRes2 = res.boolAns("no");
		Assert.assertEquals("Please enter another dish", myRes2);
	}
	
	@Test
	public void mexicanTest() {
		//fail("Not yet implemented");
		
		MyRestaurant res = new MyRestaurant();
		
		String faveFood = res.askFood("tacos");
		Assert.assertEquals("Do you like Mexican food?", faveFood);
		
		String myRes = res.boolAns("yes");
		Assert.assertEquals("The best Mexican restaurant", myRes);
		
		String myRes2 = res.boolAns("no");
		Assert.assertEquals("Please enter another dish", myRes2);
	}
	
	@Test
	public void indianTest() {
		//fail("Not yet implemented");
			
		MyRestaurant res = new MyRestaurant();
			
		String faveFood = res.askFood("curry");
		Assert.assertEquals("Do you like Indian food?", faveFood);
			
		String myRes = res.boolAns("yes");
		Assert.assertEquals("The best Indian restaurant", myRes);
			
		String myRes2 = res.boolAns("no");
		Assert.assertEquals("Please enter another dish", myRes2);
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
				
		MyRestaurant res = new MyRestaurant();
				
		String faveFood = res.askFood("stuff");
		Assert.assertEquals("There is no recommendations for you currently in our DB. Would you like to enter another food?", faveFood);
				
		String myRes = res.boolAnsTwo("yes");
		Assert.assertEquals("please enter another dish", myRes);
				
		String myRes2 = res.boolAnsTwo("no");
		Assert.assertEquals("Bye Bye", myRes2);
	}

}
