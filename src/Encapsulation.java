// Abstract is a blueprint of a class, it doesn't have a method usually
//ChildClass
class Encapsulations{
	private int ssn;
	private String Name;
	private int Age;
	private int ZipCode;
	
	public int getSSN() {
		return ssn;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public int getZipCode() {
		return ZipCode;
	}
	public void  SetSSN(int newValue) {
		ssn = newValue; //New value will come from Public main class
	}
	public void SetName (String newValue) {
		Name = newValue;
	}
	public void SetAge(int newValue) {
		Age = newValue;
	}
	public void SetZipCode(int newValue) {
		ZipCode = newValue;
	}
}




public class Encapsulation {//Superclass/Parentclass

	public static void main(String[] args) {
		// Encapsulation is a process of wrapping code and data
		//together into a single unit.
		Encapsulations obj = new Encapsulations ();
		//
		obj.SetName("Prosmart");
		obj.SetSSN(000000);
		obj.SetAge(50);
		obj.SetZipCode(11368);
		System.out.println("Employee Name"+ "" +obj.getName());
		System.out.println("Employee SSN"+ "" +obj.getSSN());
		System.out.println("Employee Age"+ "" +obj.getAge());
		System.out.println("Employee ZipCode" + "" +obj.getZipCode());
	}

}
