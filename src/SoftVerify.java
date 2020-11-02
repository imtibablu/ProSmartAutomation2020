import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVerify {
WebDriver driver;

SoftAssert sa=new SoftAssert();
@BeforeMethod
public void openbrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
}
@Test (priority=1)
public void VerifyTitle () {
		String url = driver.findElement(By.xpath("//a[@class='_8esh']")).getAttribute("href");
		String expectedurl = "";
		sa.assertEquals(url, expectedurl);
		sa.assertAll();
	 } 
	}