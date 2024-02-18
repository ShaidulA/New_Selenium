package Maven_Project.Selenium_jenkin;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	WebDriver driver;
	@BeforeMethod
	public void browser() 
	{
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.orangehrm.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}



	
	@Test
	  public void login () 
	  {
		  System.out.println("login");
		  //Assert.assertEquals("true")
		  
	  }
	  
	  @Test(dependsOnMethods="login")
	  public void application () 
	  {
		  System.out.println("application");
	  }

	  @Test
	  public void logout() 
	  {
		  System.out.println("logout");
		  
	  }
	}
