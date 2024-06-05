package InheritancePkg_8;
class Bank
{
    void facilites() // This Method is not Overriden in other Classes...
    {
        System.out.println("We have Locker Facility");
    }
    int getroi() //This Method is Overriden in other Classes...
    {
        return 0;
    } 
}

class SBI extends Bank
{
    @Override
    int getroi()
    {
        return 7;
    }
}

class ICICI extends Bank
{
    @Override
   int getroi()
    {
        return 8;
    }
}

public class MethodOverriding
{
    public static void main(String args[])
    {
       Bank b1=new Bank();
       SBI s1=new SBI();
       ICICI i1=new ICICI();
       System.out.println("Rate of Interest (BANK):"+b1.getroi());
       System.out.println("Rate of Interest (SBI):"+s1.getroi());
       System.out.println("Rate of Interest (ICICI):"+i1.getroi());
       b1.facilites();
       s1.facilites();
       i1.facilites();
    }
}
