package Overriding_8_0;

class Bank
{
	void greet() //Not Overridden
	{
		System.out.println("Welcome to the Banking System");
	}
	
	float getRateOfInterest()
	{
		return 0;
	}//Overridden Method
	
}

class SBI extends Bank
{
		
	float getRateOfInterest()
	{
		return 9.2f;
	}
}

class HDFC extends Bank
{
	float getRateOfInterest()
	{
		return 11.2f;
	}
}

public class methodoverride1 {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.getRateOfInterest());
		b.greet();
		
		SBI b1 = new SBI();
		System.out.println(b1.getRateOfInterest());
		b1.greet();
		
		HDFC b2 = new HDFC();
		System.out.println(b2.getRateOfInterest());
		b2.greet();
		

	}

}
