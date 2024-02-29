package TestNG.Axis;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"sanity","regression"})
	public void login() {
		System.out.println("user is able to login");
		
		
		
	}
	@Test(groups= {"regression"})
	public void addtocarts() {
		System.out.println("products added to cart");
	}
	@Test(groups= {"regression"})
	public void  products() {
		System.out.println("products listed in the cart");
	}
	@Test(groups= {"sanity"})
	public void payment() {
		System.out.println("user is able to make payment");
	}
		
		
		

}
