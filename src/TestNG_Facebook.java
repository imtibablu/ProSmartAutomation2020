import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Facebook {
 
	WebDriver driver;
	@BeforeTest
 
 public void openbrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	 
 }
	
	@Test(priority=1)
	public void GetPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2)
	public void Login() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prosmartusa@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		System.out.println("user were able to ");
	}
	@Test(priority=3)
	public void ClickOnLogin() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("User able to Login");
	}
	@AfterTest
	public void ClosingBrowser() {
		driver.quit(); //or driver.close();
	}
	
	
}
