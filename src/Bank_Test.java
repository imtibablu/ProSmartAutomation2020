
public class Bank_Test {

	public static void main(String[] args) {
		Bank_ABC abc = new Bank_ABC();
		Bank_EFG efg = new Bank_EFG();
		Bank_GHI ghi = new Bank_GHI();
		
		System.out.println("Bank_ABC Interest Rate: "+abc.getInterestrate());
		System.out.println("Bank_EFG Interest Rate: "+efg.getInterestrate());
		System.out.println("Bank_GHI Interest Rate: "+ghi.getInterestrate());
	}

}