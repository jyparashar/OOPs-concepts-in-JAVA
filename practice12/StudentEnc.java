package practice12;
import java.io.*;
public class StudentEnc {
    int id;
    String name;

    void readData() 
    {
        try{
        //InputStreamReader isr = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(isr);
        
        //or
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ID");
        id = Integer.parseInt(br.readLine());
        if(id < 10)
        {
            throw new Exception("Less than 10");
        }
        }
        catch(NumberFormatException fme)
        {
            System.out.println(fme.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("Good Bye!");
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        StudentEnc s1 = new StudentEnc();
        s1.readData();
    }
}


