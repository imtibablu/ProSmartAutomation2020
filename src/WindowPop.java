import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WindowPop {

	public static void main(String[] args) throws IOException {
				// Providing path of the chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
				//Creating object to hold the chrome driver so we don't have to constantly call the chromeriver everytime
				WebDriver driver = new ChromeDriver();
				//Launching the URL
				driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				
				//File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//FileHandler.copy(srcfile, new File("C:\\Users\\Laptop Gallery\\Desktop\\passport.jpg"));
				String textverify=driver.findElement(By.cssSelector("p")).getText();
				System.out.println(textverify);
	}
}