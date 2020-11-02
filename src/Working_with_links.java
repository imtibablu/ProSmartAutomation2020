

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twitter.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0; i<links.size();i++) {
			if(links.get(i).isDisplayed()) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(links.size()-count);
	}

}
