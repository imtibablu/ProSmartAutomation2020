import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Hidden_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();//maximize window
		//driver.manage().deleteAllCookies(); //delete cookies
		
		Thread.sleep(5000);
		//Getting input tag and store in List variable name "numberOfElements"
		List<WebElement>numberOfElements=driver.findElements(By.tagName("input"));
		//Printing total number of hidden Elements
		System.out.println(numberOfElements.size());
		
		for (int i=0; i<numberOfElements.size(); i++) {
			//Print all hidden input tag
			//equalsIgnoreCase = means doesn't matter if it's upper case or lower case
			if(numberOfElements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")) {
				//check for empty text. != Not equal to
				if(!(numberOfElements.get(i).getAttribute("value").trim().isEmpty())) {
				//print all hidden Element texts
				//trim=allows you to ignore or empty spaces
					System.out.println("Hidden Element Text= " + i + " " + numberOfElements.get(i).getAttribute("value").trim());
				}
			}
		}

	}
}