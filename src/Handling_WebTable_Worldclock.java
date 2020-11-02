import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTable_Worldclock {

	public static void main(String[] args) {
		// Providing path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//Creating object to hold the chrome driver so we don't have to constantly call the chromeriver everytime
		WebDriver driver = new ChromeDriver();
		//Launching the URL
		driver.get("https://www.timeanddate.com/worldclock/");

		//Calling the Table Element/locator
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		//Count number of rows, Getting the table element/locator and also calling the row locator
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		//Using loop we are getting the size of the row
				for(int i=1; i<rows.size();i++) {
		//count number of columns
				List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));	
		//Using loop we are getting the size of the column
				for(int j=1;j<columns.size();j++) {
		//Using getText Method we fetching text of the values within the table
				System.out.println(columns.get(j).getText()+" ");
			}
		//Line break
			System.out.println();
		/*System.out.println("Number of rows are" + " "+rows);
		System.out.println("Number of columns are" + " "+columns);*/
			}
	}

}