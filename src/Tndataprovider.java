import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tndataprovider {

		WebDriver driver;
		
	@BeforeTest 
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://demosite.center/wordpress/wp-login.php");
	}
	
	@Test(priority=1)
	public void GetPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2, dataProvider="FBLogin")
	public void Login(String username, String password) 
	{
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
		System.out.println("user were able to enter info");
	}
	/*@Test(priority=3)
	public void ClickOnLogin() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("User able to Login");
	}*/
	@DataProvider (name="FBLogin")
	public Object [][]passData()
	{
		Object[][] data= new Object [3][2]; //rows and columns
		data [0][0] = "test32343@aol.com";
		data [0][1] = "test32343";
		data [1][0] = "psl1233443@test.com";
		data [1][1] = "test32343";
		data [2][0] = "javal1233434@test.com";
		data [2][1] = "java32343";
		return data;
	}
}
