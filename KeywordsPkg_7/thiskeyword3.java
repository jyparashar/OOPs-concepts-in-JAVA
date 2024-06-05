package KeywordsPkg_7;

public class thiskeyword3 {

    void hello()
    {
        System.out.println("You are in Hello 1");
    }

    void hello2()
    {
       this.hello(); // No Need of using this here
       // because compiler do this for you...
       System.out.println("You are in Hello 2");
    }

   void hello3()
   {
      hello2();
      System.out.println("You are in Hello 3");
   }

   public static void main(String args[])
   {
       thiskeyword3 t1=new thiskeyword3();
       t1.hello3();
   }
 

}
