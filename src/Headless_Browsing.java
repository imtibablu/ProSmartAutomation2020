import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browsing {

	public static void main(String[] args) {
				// Providing path of the chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.setHeadless(true);
				
				//Creating object to hold the chrome driver so we don't have to constantly call the chromeriver everytime
				WebDriver driver = new ChromeDriver(options);
				//Launching the URL
				driver.get("https://www.shineconsultancy.in/");
				System.out.println("Title of the page"+" "+driver.getTitle());		
				driver.close();
	}

}