package KeywordsPkg_7;

public class thiskeyword2 {
    int a,b,c;

    thiskeyword2()
    {
        System.out.println("You are in Default Constructor");
    }

    thiskeyword2(int a,int b)
    {
        this(); //this must be the first statement in the constructor
        this.a=a;
        this.b=b;
       
    }
    
    thiskeyword2(int a, int b, int c)
    {
    	this(a,b);
        this.c = c;
    }

    void show()
    {
        System.out.println("a="+a+" "+"b="+b+" "+"c="+c);
    }

    public static void main(String args[])
    {
        thiskeyword2 t1=new thiskeyword2(10,20,30);
        t1.show();
    }


}
