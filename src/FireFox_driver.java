import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FireFox_driver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.findElement(By.id("homeval")).clear();	//to clear homevalue
		driver.findElement(By.id("homeval")).sendKeys("500000");	//to enter new homevalue
		driver.findElement(By.id("downpayment")).clear();	
		driver.findElement(By.id("downpayment")).sendKeys("50000");	
		//not sure about the radio button for %
		driver.findElement(By.id("intrstsrate")).clear();
		driver.findElement(By.id("intrstsrate")).sendKeys("4.0");
		driver.findElement(By.id("loanterm")).clear();
		driver.findElement(By.id("loanterm")).sendKeys("25");
		Select dropdown = new Select(driver.findElement(By.name("param[start_month]"))); //selecting the dropdown 
		dropdown.selectByVisibleText("Sep");		//selecting the month
		driver.findElement(By.id("start_year")).clear();
		driver.findElement(By.id("start_year")).sendKeys("2021");
		driver.findElement(By.id("pptytax")).clear();
		driver.findElement(By.id("pptytax")).sendKeys("2000");
		driver.findElement(By.id("pmi")).clear();
		driver.findElement(By.id("pmi")).sendKeys("0.6");
		driver.findElement(By.id("hoi")).clear();
		driver.findElement(By.id("hoi")).sendKeys("2000");
		Select dropdown2 = new Select(driver.findElement(By.name("param[milserve]"))); //selecting the dropdown 
		dropdown2.selectByVisibleText("FHA");	//
		Select dropdown3 = new Select(driver.findElement(By.name("param[refiorbuy]"))); //selecting the dropdown 
		dropdown3.selectByVisibleText("Buy"); //
		Select dropdown4 = new Select(driver.findElement(By.name("param[credit_rating]"))); //selecting the dropdown 
		dropdown4.selectByVisibleText("Excellent (720+)");
		driver.findElement(By.name("cal")).click();
	}
}