import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITst_ImplicitWait_VS_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//Implicit wait. pageLoadTimeout is smart, it only waits until the page is loaded no matter how long you put it to wait.
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/reg/");
		
		driver.manage().window().maximize();
		WebElement fn=driver.findElement(By.name("firstname"));
		WebElement ln=driver.findElement(By.name("lastname"));
		
		sendKeys(driver,fn,20,"Java");
		sendKeys(driver,ln,20,"Selenium");
	}
	//explicit wait
		public static void sendKeys (WebDriver driver, WebElement locator, int timeout, String value) {
			new WebDriverWait(driver, timeout). until(ExpectedConditions.visibilityOf(locator));
				locator.sendKeys(value);
		}
}