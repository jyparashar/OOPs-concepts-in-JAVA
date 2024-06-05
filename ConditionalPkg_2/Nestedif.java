package ConditionalPkg_2;
public class Nestedif
{
       public static void main(String args[])
       {
           int x = 5;
           int y = 10;
           
           if( x == 30 )
           {
               System.out.println("Inside X");
               if( y == 10 )
               {
                   System.out.println("Inside Y");
                   System.out.print("X = 30 and Y = 10");
               }
           }
        }
}
