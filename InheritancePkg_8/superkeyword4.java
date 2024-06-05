package InheritancePkg_8;

class first3
{
    void message()
    {
        System.out.println("This is First Class");
    }
}

public class superkeyword4 extends first3
{
    void message()
    {
        System.out.println("This is Child Class");
    }

    void show()
    {
        message(); //child class
        super.message(); //parent class
    }

    public static void main(String args[])
    {
        superkeyword4 s1=new superkeyword4();
        s1.show();
    }

}
