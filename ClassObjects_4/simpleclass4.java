package ClassObjects_4;

public class simpleclass4 {
    int rno;
    String name;
    String dept;
    
    //Default Constructor
    simpleclass4()
    {
        rno = 10;
        name = "Dhwani";
    }
    
    void setValues(int r, String n)
    {
        rno = r;
        name = n;
    }
    
    void display()
    {
        System.out.println("Name = "+name+ " Roll No = "+rno);
    }
    
    
    public static void main(String args[])
    {
        simpleclass4 s1 = new simpleclass4();
        
        //reference variable
        s1.rno = 1;
        s1.name = "Devesh";
        System.out.println(s1.rno + " " + s1.name);
        
        
        //using methods
        s1.setValues(2, "Prateek");      
        System.out.println(s1.rno + " " + s1.name);
        
        //using constructor
        simpleclass4 s2 = new simpleclass4();
        System.out.println(s2.rno + " " + s2.name);
    }
}

