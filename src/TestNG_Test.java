import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Test {
	//pre-condition
		@BeforeTest
		public void openbrowser() {
			System.out.println("browser opened");
		}
		//Step Annotation
		@Test (priority = 1)
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
		public void closebrowser(){
			System.out.println("Closing browser");
		}
}