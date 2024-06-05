package InheritancePkg_8;

class first1
{
    int a,b;
    first1()
    {
        System.out.println("This is default parent constr");
    }
    
    first1(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("This is First Constructor");
    }
}

public class superkeyword3 extends first1
{
    int c;
    superkeyword3(int a,int b,int c)
    {
        super(a, b);
        this.c = c;
    }

    void show()
    {
        System.out.println("A:"+a+" "+"B:"+b+" "+"C:"+c);
    }

    public static void main(String args[])
    {
        superkeyword3 s1=new superkeyword3(10,20,30);
        s1.show();
    }

}

