import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
public class NG_TestingSample {
  //pre-condition
	@BeforeTest
	public void openbrowser() {
		System.out.println("browser opened");
	}
	//Step Annotation
	@Test
	public void Registration () {
		System.out.println("User is able to register");
	}
	//Step annotation
	@Test
	public void Login() {
		System.out.println("User is able to register");
	}
	@Test
	public void RegisterAddress() {
		System.out.println("User is able to register address");
	}
	@Test
	public void ProfileCreation() {
		System.out.println("User is able to create profile");
	}
	@Test
	public void Signoff() {
		System.out.println("User is able to sign out");
	}
	//Post Condition
	publicbrowser(){
		System.out.println("Closing browser");
	}
}