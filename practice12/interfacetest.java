package practice12;

interface first{
    void show();
    
}

interface second extends first
{
    void print();
}

class third{
    void display()
    {
        System.out.println("Displaying");
    }
}

public class interfacetest extends third implements second
{
    public void show()
    {
       System.out.println("Showing"); 
    }
    public void print()
    {
       System.out.println("Printing"); 
    }
    
    
    public static void main(String args[])
    {
        interfacetest i=new interfacetest();
        i.show();
        i.print();
        i.display();
    }
    
}
