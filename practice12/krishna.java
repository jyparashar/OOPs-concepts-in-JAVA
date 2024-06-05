package practice12;

abstract class shape
{
    abstract void area();
}

class Rectangle11 extends shape
{
    void area()
    {
        int l = 5, w = 6;
        System.out.println("Rectangle");
        System.out.println(l*w);
    }
}

class Circle extends shape
{
    void area()
    {
        int r = 5;
        System.out.println("Circle");
        System.out.println(3.14*r*r);
    }
}

public class krishna {
    public static void main(String[] args) {
        Rectangle11 r = new Rectangle11();
        Circle c = new Circle();
        r.area();
        c.area();
    }
}
