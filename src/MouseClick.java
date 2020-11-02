import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(25000);
		
		/*List<WebElement>numberOfElements=driver.findElements(By.tagName("input"));
		System.out.println(numberOfElements.size());
		
		for (int i=0; i<numberOfElements.size(); i++) {
			if(numberOfElements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")) {
				if(!(numberOfElements.get(i).getAttribute("value").trim().isEmpty())) {
					System.out.println("Hidden Element Text= "+" "+numberOfElements.get(i).getAttribute("").trim());
				}
			}
		}*/
		
		//MouseClick
		
		Actions actionPeform = new Actions(driver);
		WebElement Event = driver.findElement(By.xpath("//*[@id='u_O_b']")); //can use any locator as long as it works
		actionPeform.doubleClick(Event).build().perform();
		//double click is click
		//COntext click is right click
	}

}
