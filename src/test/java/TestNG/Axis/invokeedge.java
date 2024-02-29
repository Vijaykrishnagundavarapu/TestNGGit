package TestNG.Axis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class invokeedge {
	@Test
	public void edge() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\gvija\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev");

	}
	
	
		
	}


