
package MethodOverloadPkg_5;

public class MethodOverload2 {

    // Overloading (By Changing No of Argruments)

    void sum(int a,int b)
    {
       System.out.println("Addition is:"+(a+b));
    }

     void sum(int a, int b, int c)
    {
       System.out.println("Addition is:"+(a+b+c));
    }

     void sum(int a, int b, int c, int d)
     {
         System.out.println("Addition is:"+(a+b+c+d));
     }

     public static void main(String args[])
     {
         MethodOverload2 m1=new MethodOverload2();
         m1.sum(10,20);

         m1.sum(10,20,30);

         m1.sum(10, 20 , 30, 40);
     }


}
