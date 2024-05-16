package organization;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass 
{
	static WebDriver driver;
	@BeforeClass
	public static void launch()
	{
		
		driver= WebDriverManager.chromedriver().create();
	}
	
	@Test
	public static void appBasic()
	{
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("Application launched successfully");
	}
}
