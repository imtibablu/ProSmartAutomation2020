import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Classwork_Assert {
		WebDriver driver;

		SoftAssert sa=new SoftAssert();
		@BeforeTest
		public void openbrowser() {
			 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.get("https://www.microsoft.com/en-us/");
		}
		@Test(priority=1)
		public void VerifyTitle () {
				String actualtitle = driver.getTitle();
				String expectedtitle = "Microsoft - Official Home Page";
				sa.assertEquals(actualtitle,expectedtitle);
				sa.assertAll();
			 } 
		@Test(priority=2)
		public void Verify365url() {
			//String url = driver.findElement(By.xpath("//a[@class='c-uhf-nav-link']")).getAttribute("href");
			String url = driver.findElement(By.cssSelector("a#uhfCatLogo")).getAttribute("href");
			String expectedurl="https://www.microsoft.com/microsoft-365";
			sa.assertEquals(url, expectedurl);
		}
			}
