package TestNG.Axis;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invokechrome {
	@Test
	public void chrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		 ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
	}

}
