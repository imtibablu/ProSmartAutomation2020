import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Options {

	public static void main(String[] args) throws InterruptedException {
		// Providing path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//Creating object to hold the chrome driver so we don't have to constantly call the chromeriver everytime
		WebDriver driver = new ChromeDriver();
		//Launching the URL
		driver.navigate().to("https://www.timeanddate.com/worldclock/");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
