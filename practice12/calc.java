package practice12;
import java.util.*;
import java.math.*;
public class calc {
    
    public static void main(String args[])
    {
        int a,b;
        String op;
        Scanner s=new Scanner(System.in);
        
        do
        {
        System.out.print("> ");
        a=s.nextInt();
        
        op=s.next();
        
        b=s.nextInt();
        
        if(a!=0)
        {
        
        if(op.equals("+"))
        {
            System.out.println(a+b);
        }
        else if(op.equals("^"))
        {
            System.out.println(Math.pow(a, b));
        }
        else
        {
            System.out.println("Unknown Operator");
        }
        }
        else
        {
            System.out.println("Good Bye");
            break;
        }
        }while(true);
    }
    
}
