package InstanceInitializerBlockPkg_8_1;

//Which executes first?

public class IIB2 
{
       IIB2()
    {
        System.out.println("Inside Parent Constr");
    }
    
    {
        System.out.println("Inside Block");
    }
    
    public static void main(String[] args) {
        IIB2 i1 = new IIB2();
    }
}

/*
In the above example, it seems that instance initializer block 
is firstly invoked but NO. Instance intializer block is invoked
at the time of object creation. The java compiler copies the 
instance initializer block in the constructor after the first 
statement super(). 
So firstly, constructor is invoked.
Lets see next example
*/