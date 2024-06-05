package InstanceInitializerBlockPkg_8_1;

class IIB3Parent
{
    IIB3Parent()
    {
        System.out.println("Inside Parent Constr");
    }
}

public class IIB3 extends IIB3Parent
{
    IIB3()
    {
        System.out.println("Inside Child Constr");
    }
    
    {
        System.out.println("Inside Child IIBlock");
    }
    
    public static void main(String[] args) {
        IIB3 i3 = new IIB3();
    }
}
