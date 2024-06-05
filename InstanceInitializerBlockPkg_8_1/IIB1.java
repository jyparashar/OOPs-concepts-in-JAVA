package InstanceInitializerBlockPkg_8_1;

public class IIB1 {
    int rno; //member instance variable
    
    IIB1() //constructor
    {
        System.out.println("Inside Constructor");
        System.out.println(rno);
    }
    
    //IIB
    {
        rno = 10;
    }
    
    public static void main(String[] args) {
        IIB1 i = new IIB1();
    }
}
