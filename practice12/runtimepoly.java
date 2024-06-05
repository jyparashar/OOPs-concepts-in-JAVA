package practice12;



class Bank
{
    void roi()
    {
        System.out.println("roi is:"+0);
    }   
}

class SBI extends Bank
{
  void roi()
    {
        System.out.println("roi is:"+7);
    }  
}

class ICICI extends Bank
{
  void roi()
    {
        System.out.println("roi is:"+9);
    }  
}

public class runtimepoly {
    
    public static void main(String a[])
    {
       // int a=10;
        
        Bank b=new Bank();
        b.roi();
        
        Bank b1=new SBI();
        b1.roi();
        
        b=new ICICI();
        b.roi();
    }
    
}
