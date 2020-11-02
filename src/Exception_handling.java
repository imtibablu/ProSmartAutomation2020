
public class Exception_handling {

	public static void main(String[] args) {
		// TODO Exception
		
	/*	try
		{
		int a=5, b=0, result;
		result = a/b;
		System.out.println(result);
		}
		catch (Exception x)
		{System.out.println("Divided by zero out is: "+x);
		}*/
		
		try {
			int a[] = new int [3];
			a[1]=11;
			a[2]=20;
			a[3]=50;
		}
		catch (Exception x) {
			System.out.println(x);
		}
	}

}
