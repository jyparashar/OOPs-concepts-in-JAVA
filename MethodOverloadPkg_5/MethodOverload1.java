package MethodOverloadPkg_5;

public class MethodOverload1 {

    // Overloading (By Changing Type of Arguments)

    void sum(int a, long b)
    {
       System.out.println("Addition is:"+(a+b));
    }
   
    void sum(int a, int b, int c)
    {
       System.out.println("Addition is:"+(a+b+c));
    }

     public static void main(String args[])
     {
         MethodOverload1 m1=new MethodOverload1();
         m1.sum(10, 20);
     }
}




