package KeywordsPkg_7;

public class thiskeyword1 {
    int a,b,name;

    thiskeyword1(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    void show()
    {
        System.out.println("a="+a+" "+"b="+b);
    }

    public static void main(String args[])
    {
        thiskeyword1 t1=new thiskeyword1(10,20);
        t1.show();
    }


}
