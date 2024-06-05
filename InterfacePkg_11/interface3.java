package InterfacePkg_11;

interface Printable1
{
    void print();
}

interface Showable1 extends Printable1
{
    void show();
}

class interface3 implements Showable1
{
    public void print()
    {
        System.out.println("Hello");
    }

    public void show()
    {
        System.out.println("Welcome");
    }

    public static void main(String args[])
    {
        interface3 obj = new interface3();
        obj.print();
        obj.show();
 }
}
