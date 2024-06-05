package InheritancePkg_8;

class a2
{
    void print()
    {
        System.out.println("Hello !!! You are in A Class");
    }
}

class b2
{
    void print()
    {
        System.out.println("Hello !!! You are in B Class");
    }
}

public class multiple extends a2//, b2
{
    public static void main(String args[])
    {
        multiple m=new multiple();
        m.print();
    }
}
