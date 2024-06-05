package KeywordsPkg_7;

public class staticblock {
	static int a;
	
	//static block
	static
	{
		a = 5;
		System.out.println("This is static block");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
	}
}
