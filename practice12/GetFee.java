package practice12;

import java.util.*;

abstract class collegefee
{
    int fee;
    abstract void getfee();
    
    void calculatefee(int years)
    {
        System.out.println(years*fee);
    }
}

class HCST extends collegefee
{
    void getfee()
    {
        fee=125000;
    }
}

class AEC extends collegefee
{
    void getfee()
    {
        fee=115000;
    }
}

class HITM extends collegefee
{
    void getfee()
    {
        fee=110000;
    }
}

class getfeefinal
{
    collegefee getfee(String college)
    {
        if(college==null)
        {
            return null;
        }
        
        if(college.equalsIgnoreCase("HCST"))
        {
            return new HCST();
        }
        
       else if(college.equalsIgnoreCase("AEC"))
        {
            return new AEC();
        }
        
       else if(college.equalsIgnoreCase("HITM"))
        {
            return new HITM();
        }
        return null;
    }
}

public class GetFee 
{
    public static void main(String args[])
    {
        getfeefinal f=new getfeefinal();
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter the college name:");
        String college=s.next();
        
        System.out.println("Enter the total no of years:");
        int years=s.nextInt();
        
        collegefee fees=f.getfee(college);
        
        System.out.println("College ="+college);
    }
    
}
