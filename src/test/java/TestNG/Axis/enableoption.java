package TestNG.Axis;

import org.testng.annotations.Test;

public class enableoption {
	
	@Test(enabled=false)
	public void testcase1() {
		System.out.println("testcase1 excetued sucessfully");
	}
	@Test
	public void testcase2() {
		System.out.println("testcase2 excetued sucessfully");
	}
	@Test
	public void testcase3() {
		System.out.println("testcase3 excetued sucessfully");
	}

}
