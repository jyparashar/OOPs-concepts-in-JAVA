package ClassObjects_4;

public class simpleclass {
    int rno;
    String name;
   
    void display()
    {
        System.out.println("Name = "+name+ " Roll No = "+rno);
    }
    
    
    public static void main(String args[])
    {
        simpleclass s1 = new simpleclass();
        s1.display();
    }
}
