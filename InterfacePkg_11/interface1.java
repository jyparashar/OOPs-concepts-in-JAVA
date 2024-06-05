package InterfacePkg_11;

interface papa
{
    void sings();
}

class mummy
{
   public void sings()
    {
        System.out.println("Classical....");
    }
   public void dances()
   {
       System.out.println("Bharatnatyam....");
   }
}

public class interface1 implements papa
{
   public void sings()
    {
        System.out.println("Jazz");
    }
    
    public static void main(String[] args) {
        interface1 a1= new interface1();
        a1.sings();
    }
}

