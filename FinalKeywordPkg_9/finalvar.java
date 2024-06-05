//Final is used to restrict the user...
//If we declare any var as final we can't change its value.

package FinalKeywordPkg_9;

public class finalvar
{
    final int a=100; //Final variable

    final int b; //Blank Final Variable... 
    //we can initialize it only in constructor..

    finalvar()
    {
        b=400;
    }
    
    void showa()
    {
        //b=200; Error as b is final (constant)
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
    }

    public static void main(String args[])
    {
        finalvar f1=new finalvar();
        f1.showa();
    }

}
