import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// reg_email_confirmation__

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		
		driver.findElement(By.name("firstname")).sendKeys("Pro");
		driver.findElement(By.name("lastname")).sendKeys("Smart");
		driver.findElement(By.name("reg_email__")).sendKeys("prosmart@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("prosmart@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("prosmart2305");
		Select dropdown = new Select(driver.findElement(By.id("day")));
		dropdown.selectByVisibleText("3");
		Select dropdown2 = new Select (driver.findElement(By.xpath("//*[@id='month']")));
		dropdown2.selectByVisibleText("Feb");
		Select dropdown3 = new Select (driver.findElement(By.id("year")));
		dropdown3.selectByVisibleText("1990");
		driver.findElement(By.id("u_0_5")).click();
		
	}

}
