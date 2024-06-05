package practice12;

interface firstint{
    int a=10; //static and final
    
    void show();  // public and abstract
    void print();
}

interface secondint extends firstint
{
    int a=20;
    void disp();
}

abstract class test1 implements secondint
{
    
}

class inttest extends test1
{
    int a=30; 
    public void show()
    {
        System.out.println("Showing");
    } 
    public void print()
    {
        System.out.println("printing");
    } 
    public void disp()
    {
        System.out.println("displaying");
    } 
    
    public static void main(String args[])
    {
    inttest t=new inttest();
    t.print();
    t.disp();
    t.show();
 
    System.out.println(firstint.a);
    
    }
}



   
    

