import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkWithImages {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		
		/*File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File("C:\\Users\\Laptop Gallery\\Desktop\\Amazon.jpg"));*/
		
		/* List<WebElement>images=driver.findElements(By.tagName("img")); //always tagName & findElements
		System.out.println(images.size());
		for(int i=0; i<images.size(); i++){
			System.out.println(images.get(i).getAttribute("src")); 
		} */
		Thread.sleep(25000);
		List<WebElement>images=driver.findElements(By.tagName("img")); //Creating an object for the images
		System.out.println(images.size()); //the images found
		for(int i=0; i<images.size(); i++) { //Loop to keep searching for images
			System.out.println(images.get(i).getAttribute("src")); //To print the the total numbers and urls of images
		
		}
		
	
	}

}
