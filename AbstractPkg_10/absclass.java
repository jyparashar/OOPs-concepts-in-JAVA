package AbstractPkg_10;

abstract class operation
{
    int a,b;
    
    operation(int a1,int b1)
    {
        a=a1;
        b=b1;
        System.out.println("A="+a+" "+"B="+b);
    }
    
    abstract int result();
}

class add extends operation
{
    add(int a1,int b1)
    {
        super(a1,b1);
    }
    
    int result()
    {
        System.out.println("In Addition:");
        return (a+b);
    }    
}

class sub extends operation
{
    sub(int a1,int b1)
    {
        super(a1,b1);
    }
    
    int result()
    {
        System.out.println("In Subtraction:");
        return (a-b);
    }
}




class absclass
{
    public static void main(String args[])
    {
        //operation op=new operation(10,20);
        
        operation op;
        op=new add(10,20); //upcasting
        System.out.println("Result is:"+op.result());
        System.out.println(new add(10,20).result()); //Anon. Object
        
        op=new sub(40,30);
        System.out.println("Result is:"+op.result());

        //Usual Way
        add a1 = new add(5, 10);
        a1.result();
    }
}
