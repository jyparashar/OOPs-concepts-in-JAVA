package practice12;

abstract class it1{
    int a=10;
    
    abstract void n1();
    interface it2
    {
        void m1();
    }
}

public class inttest2 extends it1 
{
    void n1()
    {
        System.out.println("n1");
    }
   public static void main(String[] args)
   {
       inttest2 i=new inttest2();
       i.n1();
   }
    
}
