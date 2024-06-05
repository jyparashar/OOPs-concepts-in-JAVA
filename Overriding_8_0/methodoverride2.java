package Overriding_8_0;

public class methodoverride2 {
	
	static void display()
	{
		System.out.println("Hello from First");
	}
	
	public static void main(String[] args) {
		display();
		//or
		methodoverride2.display();

	}

}
