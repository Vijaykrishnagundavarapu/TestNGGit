package TestNG.Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	
	@Test
	public void testsofsoftassert() throws InterruptedException {
		hardassert st = new hardassert();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(500);
				
		driver.manage().window().maximize();
				
		String actualTitle = driver.getTitle();
		String expectedTitle = "Orange";
				
		Assert.assertEquals(actualTitle, expectedTitle);
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
		driver.close();
	}

}
