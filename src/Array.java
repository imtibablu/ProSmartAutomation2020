
public class Array {

	public static void main(String[] args) {
		// TODO Array
	/*	//Example 1: 
		int [] val= {10,20,30,40};
		for (int i=0;i<val.length;i++) {
		System.out.println(val[i]);
		}
	}

}*/
		
		/*int [] val = new int [4];
		val [0]=10;
		val [0]=20;
		val [0]=30;
		val [0]=40;
		for(int i=0;i<val.length;i++) {
			System.out.println(val[i]);
		}*/
		
		int [][]value= {{10,20,30},{60,70,80},{55,65,75}};
		for (int i=0;i<value.length;i++) {
			for (int j=0; j<value.length;j++) {
				System.out.println(value[i][j]+" ");
			}
		}
	}
}