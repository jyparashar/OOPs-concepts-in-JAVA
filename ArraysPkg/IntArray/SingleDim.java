package ArraysPkg.IntArray;
import java.io.*;
public class SingleDim
{
    public static void main(String args[]) throws Exception
    {
        int a[]=new int[5];
        int i;
           
        try
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Values of Array:");
        for(i=0;i<6;i++)
        {
            a[i]=Integer.parseInt(br.readLine());

        }


        System.out.println("Values of Array are:");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);

        }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
