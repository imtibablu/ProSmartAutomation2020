/*class demo{//father or Mother
	public void m1(){
		System.out.println("Manual Testing");
	}
}
class demo2 extends demo{//child 1
	public void m2() {
		System.out.println("Automation Test");
	}
}
class demo3 extends demo2{//child 2
	public void m3() {
		System.out.println("Java Selenium");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Inheritance
		demo3 obj=new demo3();
				obj.m1();
				obj.m2();
				obj.m3();
	}

}*/
//Suppose a car from different brands have diferent characteristics, 

class Cars{
	void HONDA (){
		String Model= "Model";
		int speed= 200;
		String Color= "Black";
		int Break = 5;
		System.out.println("This is a HONDA car."+"Speed is: " + speed+ "Color is: "+Color+"Break is: "+ Break);
	}
}
class bmw extends Cars{
	void BMW() {
		String Model= "Model";
		int speed= 200;
		String Color= "Black";
		int Break = 5;
		int Acc = 15;
		System.out.println("This is a BMW car."+"Speed is: " + speed+ "Color is: "+Color+"Break is: "+ Break + "The Accelerator type: "+Acc);
	}
}

class Lexus extends bmw{
	void LEXUS() {
	String Model= "Model";
	int speed= 200;
	String Color= "Black";
	int Break = 5;
	int Acc = 15;
	System.out.println("This is a LEXUS car."+"Speed is: " + speed + "Color is: "+Color+"Break is: "+ Break + "The Accelerator type: "+Acc);
	}
}
class Audi extends Lexus{
	void AUDI() {
	String Model= "Model";
	int speed= 200;
	String Color= "Black";
	int Break = 5;
	System.out.println("This is a AUDI car."+"Speed is: " + speed + "Color is: "+Color+"Break is: "+ Break);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO using inheritance method print all the data for HONDA, BMW, LEXUS, AUDI.
		//Data set Model, Speed, Color, Break, Acc
		Audi obj= new Audi(); //Object name is always the last class name because we can 
		obj.HONDA();
		obj.BMW();
		obj.LEXUS();
		obj.AUDI();
	}

}
