package MethodOverloadPkg_5;

public class OverloadMain {

    public static void main(int a)
    {
       System.out.println(a);
    }
    
    public static void main(String a)
    {
        System.out.println(a);
    }
      
    public static void main(String args[])
    {
        
        main(10);
        System.out.println("main() method invoked");
        
        main("Hello");
    }

}
