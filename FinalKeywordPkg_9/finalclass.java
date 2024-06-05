//If we declare a class as final then we can't extend it.
package FinalKeywordPkg_9;

final class abc
{
   void show()
   {
       System.out.println("Hello");
   }
    
}

public class finalclass
{
    public static void main(String[] args) {
        abc a1 = new abc();
        a1.show();
    }
}
