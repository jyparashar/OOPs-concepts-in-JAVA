package InheritancePkg_8;

class first
{
    first()
    {
        System.out.println("This is Parent Class Constructor");
    }
}

public class superkeyword2 extends first
{
    superkeyword2()
    {
        super(); 
        // This is to invoke parent class constructor.
        //but this is automatically done by compiler...
        System.out.println("Hello!!! We are in Child Class");
    }

    public static void main(String args[])
    {
        superkeyword2 s1=new superkeyword2();
    }

}
