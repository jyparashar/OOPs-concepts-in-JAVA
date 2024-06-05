package KeywordsPkg_7;

public class staticvar {

    int sid;
    String name;
    static String college="HCST";

    staticvar()
    {

    }

    staticvar(int a,String b)
    {
        sid=a;
        name=b;
    }

    void display()
    {
        System.out.println("SID:"+sid+" "+"Name:"+name+" "+"College:"+college);
    }

    public static void main(String args[])
    {
        staticvar s1=new staticvar(100,"Ajay");
        staticvar s2 = new staticvar();

        s1.display();
    }
}
