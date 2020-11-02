import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thinley {

	public static void main(String[] args) {
	//Providing path of the Chrome driver
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	//creating an object to hold the chrome driver so we don't have to constantly call the chrome driver every time
	WebDriver driver = new ChromeDriver();
	//Getting the URL - 
				driver.get("https://www.timeanddate.com/worldclock/?continent=namerica/");
				
	WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div"));
	//count number of rows
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	//count number of columns
	List<WebElement>columns=table.findElements(By.tagName("td"));
				
	System.out.println("number of rows are"+" "+rows);
				
	System.out.println("number of column are"+" "+columns);
				}

}
