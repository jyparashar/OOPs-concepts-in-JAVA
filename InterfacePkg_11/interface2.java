package InterfacePkg_11;

interface Printable
{
    int a = 5;
    void print();
}

interface Showable
{
    int a = 10;
    void show();
}

public class interface2 implements Printable,Showable
{
    public void print()
    {
    	System.out.println("Hello "+Printable.a);
    }

    public void show()
    {
        System.out.println("World "+Showable.a);
    }

    public static void main(String args[])
    {
        //printable p = new printable();
        interface2 obj = new interface2();
        obj.print();
        obj.show();
    }
}