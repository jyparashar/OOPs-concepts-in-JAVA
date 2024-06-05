package FinalKeywordPkg_9;

public class staticblankfinal {
    
    static final int a; //static blank final variable
    
    //Static Block
    static{
        a = 10; 
    }
    
    void show()
    {
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        staticblankfinal sb1 = new staticblankfinal();
        sb1.show();
    }
}
