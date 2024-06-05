//If we declare method as final then we can not override it.
package FinalKeywordPkg_9;

class ab
{
    final void show()
    {
        System.out.println("You are in final method of class ab");
    }
}

public class finalmethod extends ab
{
      //Error as show method in ab is final
//    void show()
//    {
//        super.show();
//        System.out.println("Child Class Overrridden");
//    }
    
    public static void main(String[] args) {
        finalmethod f1 = new finalmethod();
        f1.show();
    }

}




