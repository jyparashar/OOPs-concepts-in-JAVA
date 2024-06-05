package InheritancePkg_8;
class xyz
{
	int x = 50;
}

class a extends xyz
{
    int x=100;  //instance variable
    int y = super.x;
    static int c = 500; //class variable
}

class b extends a
{
    int x = 200;
    int c = 600;
    void show()
    {
        System.out.println("Value of x in b:"+x);
        System.out.println("Value of x in a:"+super.x);
        System.out.println("Value of x in xyz:"+y);
        System.out.println("Value of c in b:"+c);
        System.out.println("Value of c in a:"+super.c);
    }
}

public class superkeyword
{
    public static void main(String args[])
    {
        b b1=new b();
        b1.show();
    }
}


