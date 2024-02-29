package TestNG.Axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.testng.asserts.HardAssert;

//import dev.failsafe.internal.util.Assert;


public class softassert {
	@Test
	public void testsofsoftassert() throws InterruptedException {
		softassert st = new softassert();
		
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
