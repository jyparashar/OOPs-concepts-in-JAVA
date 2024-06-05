package FinalKeywordPkg_9;

public class finalparameter {
    
    void area(final int a)
    {
        //a++; //It is not possible as a is final
        System.out.println(a*a);
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        finalparameter fp1 = new finalparameter();
        fp1.area(50);
    }
}
