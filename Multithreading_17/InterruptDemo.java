package Multithreading_17;

public class InterruptDemo extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("Thread Running");
        }catch(InterruptedException e){
            throw new RuntimeException("Thread interrupted..."+e);

        }
    }
    public static void main(String args[])
    {
        InterruptDemo t1=new InterruptDemo();
        t1.start();
        try
        {
            t1.interrupt();
        }catch(Exception e){System.out.println("Exception handled "+e);}
    }
}