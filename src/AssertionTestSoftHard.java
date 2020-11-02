import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AssertionTestSoftHard {
WebDriver driver;
@BeforeTest
public void openbrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 /*driver.get("https://www.advantageonlineshopping.com/");*/
	 driver.get("https://www.facebook.com/");
}
@Test(priority=1)
public void VerifyTitle() {
	/*String actualtitle=driver.getTitle();
	System.out.println(actualtitle);*/
	String actualtext = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
	String Expectedtitle = "Facebook helps you connect and share with the people in your life.";
	/*String Expectedtitle=" Advantage Shopping";*/
	Assert.assertEquals(actualtext, Expectedtitle);
	
	}
}