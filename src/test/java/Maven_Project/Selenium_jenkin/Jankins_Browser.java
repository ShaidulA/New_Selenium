package Maven_Project.Selenium_jenkin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jankins_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();

	}

}
