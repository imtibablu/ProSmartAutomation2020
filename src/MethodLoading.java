
public class MethodLoading {

	public static void main(String[] args) {
		// Overloading occurs when two or more methods in one class have the same method name but different parameters
		System.out.println(Add(2, 10));
		System.out.println(Add(2.5, 10.65));
		System.out.println(Add("Selenium:", "Automation"));
	}

	public static int Add (int a, int b) {
		return (a+b);
	}
	public static double Add(double a, double b) {//you can change the parameters int double, string etc 
		return (a+b);
	}
	public static String Add(String a, String b) {
		return(a+b);
	}
}
