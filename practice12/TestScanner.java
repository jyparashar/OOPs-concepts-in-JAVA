package practice12;

import java.util.Scanner;
import java.io.*;

class TestScanner {
    int rno;
    String name;
    Scanner t1=new Scanner(System.in);
    
    void read()
    {
    	System.out.println("Enter your rno using scanner:");
        rno=t1.nextInt();
    	
        System.out.println("Enter your name using scanner:");
        name=t1.next();
        
        
    }
    
    void read2()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("Enter your name using buffered reader:");
        name=br.readLine();
        
        System.out.println("Enter your rno using buffered reader:");
        rno=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    void show()
    {
        System.out.println("Name is: "+name+" and Roll No is: "+rno);
        
    }
    
    public static void main(String args[])
    {
        TestScanner t1=new TestScanner();
        TestScanner t2=new TestScanner();
        t1.read();
        t2.read2();
        t1.show();
        t2.show();
    }
    
}
