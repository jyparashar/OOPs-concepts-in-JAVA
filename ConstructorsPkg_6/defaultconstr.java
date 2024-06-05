package ConstructorsPkg_6;

public class defaultconstr
{
   int a,b;
    defaultconstr()
    {
    	a = 5;
    	b = 6;
        System.out.println("This is Default Constructor");
    }

    public static void main(String args[])
    {
        defaultconstr d1 = new defaultconstr();
    }
}
