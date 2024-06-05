
package ConstructorsPkg_6;

public class copyconstr
{
    int len, width;

    copyconstr(int a,int b)
    {
        len=a;
        width=b;

        System.out.println("This is argument constructor and values of len and width are:"+len+" "+width);
    }

    copyconstr(copyconstr c1)
    {
        len=c1.len;
        width=c1.width;
        System.out.println("This is copy constructor and values of len and width are:"+len+" "+width);
    }

    public static void main(String args[])
    {
        copyconstr a1=new copyconstr(10,20);

        copyconstr a2=new copyconstr(a1);
    }

}
