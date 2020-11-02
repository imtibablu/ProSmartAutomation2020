import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling {
//There is 3 methods - i. Scroll by pixel/x,y coordinates, ii. Scroll by visible element, iii. Scroll to the bottom of the page
	public static void main(String[] args) throws InterruptedException {
		// Providing path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//Creating object to hold the chrome driver so we don't have to constantly call the chromeriver everytime
		WebDriver driver = new ChromeDriver();
		//Launching the URL
		driver.get("https://www.sjcny.edu/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//Create the object for script execution
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//i.Scroll by pixel. The number is a placholder. We need an extension to get the pixels
		/*js.executeScript("window.scrollBy(0, 150)", "");*/
		
		//visible element
		/*WebElement kindle=driver.findElement(By.xpath("/html/body/div/footer/div/div/div/div[2]/h3"));
		//Arguments[0].scrollIntoView() = 1 Argument, 
		js.executeScript("arguments[0].scrollIntoView();", kindle);*/
		
		//Going to bottom of the page
		//0 is static, document.body.scrollHeight
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}