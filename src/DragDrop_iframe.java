import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com//droppable/");
		//switchin to frame because dealing with frames
		driver.manage().window().maximize();
		Thread.sleep(20000);
		
		driver.switchTo().frame(0);
		Actions action1 = new Actions(driver);
		
		WebElement dropElement=driver.findElement(By.id("draggable"));
		WebElement dropsourceElement=driver.findElement(By.id("droppable"));
		//action1. clickAndhold is clicking on the draggable and holding. movetoelement is moving it to the box & release to let go
		action1.clickAndHold(dropElement).moveToElement(dropsourceElement).release().build().perform();
		
	}

}
