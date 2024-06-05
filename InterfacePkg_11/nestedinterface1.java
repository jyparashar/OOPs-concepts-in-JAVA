package InterfacePkg_11;

interface i1
{
    interface i2
    {
        void m1();
    }
void first();    
}

public class nestedinterface1 implements i1.i2 // map.entry (map=first interface, entry=second int)
{
    public void m1()
    {
       System.out.println("M1 Method");
    }
    
}
