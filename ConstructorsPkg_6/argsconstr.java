package ConstructorsPkg_6;

public class argsconstr
{
    int a,b;
    
    argsconstr()
    {
        System.out.println("values of a and b are:"+ a +" "+ b);
    }
       
    argsconstr(int x,int y)
    {
        a=x;
        b=y;
        System.out.println("values of a and b are:"+ a +" "+ b);
    }
    
    public static void main(String args[])
    {
        argsconstr a1 = new argsconstr(10,20);
        argsconstr a2 = new argsconstr();
    }

}
