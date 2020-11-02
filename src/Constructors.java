class myconstructor{
	myconstructor(String x){
		System.out.println(x);
	}
	myconstructor(int a){
		System.out.println(a);
	}
	myconstructor(int x, int y){
		System.out.println("x+y");
	}
	myconstructor(double z){
		System.out.println(z);
	}
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Create object for class
		myconstructor obj1 = new myconstructor("Java Selenium");
		myconstructor obj2 = new myconstructor(100);
		myconstructor obj3 = new myconstructor(10, 20);
		myconstructor obj4 = new myconstructor(2.5);
	}

}
