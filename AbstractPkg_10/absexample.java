package AbstractPkg_10;

//Class Abstraction (0 -> 100%)
abstract class Bank1
{
    abstract void greet(); //Concrete
//    {
//        System.out.println("Welcome to the Bank System");
//    }
    
    abstract int getROI(); //Abstract
}

class SBI1 extends Bank1
{
    void greet()
    {
        System.out.println("Hello");
    }
   int getROI()
    {
        return 9;
    } 
}

public class absexample {
    public static void main(String[] args) {
    	//Bank b = new Bank();
        SBI1 s = new SBI1();
        s.greet();
        System.out.println(s.getROI());
    }
}
