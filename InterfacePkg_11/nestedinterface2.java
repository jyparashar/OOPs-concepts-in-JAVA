package InterfacePkg_11;

class testnested
{
    interface nestint
    {
        void m1();
    }
    
}

public class nestedinterface2 implements testnested.nestint
{
    public void m1()
    {
        System.out.print("Inside m1 method");
    }
    
}
