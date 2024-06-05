package InheritancePkg_8;

class a1
{
    int a=100;
    void display()
    {
        System.out.println("The value of a in Class A is:"+a);
    }
}

class b1 extends a1
{
    int a = 200;
    void display2()
    {
    	System.out.println();
        System.out.println("The value of a in Class B is:"+a);
    }
}

public class Multilevel extends b1
{
    public static void main(String args[])
    {
    Multilevel m1=new Multilevel();
    m1.display();
    m1.display2();
    }
}
