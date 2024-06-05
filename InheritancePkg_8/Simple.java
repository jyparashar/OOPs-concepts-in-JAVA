package InheritancePkg_8;

class Simple2
{
    int sid=100;
    String name="Ajay";
    
    void display()
    {
        System.out.println("This is Base Class");
    }
}

public class Simple extends Simple2
{
    String college="HCST";

    public static void main(String args[])
    {
        //Simple2 s=new Simple2();
        Simple s = new Simple();
                   
        s.display();
        System.out.println("SID="+s.sid+" "+"Name="+s.name+" "+"College="+s.college);
    }

}


