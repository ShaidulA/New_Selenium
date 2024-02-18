package Maven_Project.Selenium_jenkin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	public void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
}
