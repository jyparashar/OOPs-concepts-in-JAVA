package ExceptionHandle_15;

import java.io.*;
class welcome
{
	int admno;
	String name;
	float eng, maths, sci, total;

	float ctotal()
	{
		return eng+maths+sci;
	}

	void takedata()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter Admission No:");
			admno=Integer.parseInt(br.readLine());

			System.out.println("Enter Name:");
			name=br.readLine();

			System.out.println("Enter Marks:");
			eng=Float.parseFloat(br.readLine());
			maths=Float.parseFloat(br.readLine());
			sci=Float.parseFloat(br.readLine());

			total=ctotal();
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	void showdata()
	{
		System.out.println("Admission No:"+admno+" "+"Name:"+name+" "+"Total:"+total);
	}

	public static void main(String args[])
	{
		welcome s1=new welcome();
		s1.takedata();
		s1.showdata();
	}
}


