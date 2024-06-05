package practice12;

import java.util.*;
public class ObjectCreation 
{
//Instance Variables
	String name;
	int rno;

// Args Constr
	ObjectCreation()
	{

	}
	
	ObjectCreation(String n, int r)
	{
		name = n;
		rno = r;
	}
	
//Methods
	void getData(String n, int r)
	{
		name = n;
		rno = r;
	}
	
	void readData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your rollno");
		rno = sc.nextInt();
	}
	
	void displayData()
	{
		System.out.println("Name is: "+name + " Roll No is:"+rno);
	}
	
	public static void main(String args[])
	{
		//classname objectname = new class();
		ObjectCreation s1 = new ObjectCreation();
		ObjectCreation s2 = new ObjectCreation();
		ObjectCreation s3 = new ObjectCreation();
		ObjectCreation s4 = new ObjectCreation("Khushi",15);
		
		//Reference Variables		
		s1.name = "Uday Soni";
		s1.rno = 14;
		s1.displayData();
		
		
		//Intitialize using methods
		s2.getData("Prince", 20);
		s2.displayData();
		
		//Intitialize using methods-2
		s3.readData();
		s3.displayData();
		
		//Using Args Constructor
		s4.displayData();
		
	}
	
	
}
