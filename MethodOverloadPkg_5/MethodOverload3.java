package MethodOverloadPkg_5;

class Adder
{  
	int add(int a,int b)
	{
		return a+b;
	}  
	double add(int a,float b)
	{
		return a+b;
	}  
}  
public class MethodOverload3
{  
	public static void main(String[] args)
	{  
		Adder a1 = new Adder();
		System.out.println(a1.add(11,11));//ambiguity  
	}
}  
