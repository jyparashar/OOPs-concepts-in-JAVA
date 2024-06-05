package InterfacePkg_11;

interface Living{
    void speak();
    void walk();
}

interface Animal extends Living
{
    void attack();
}

interface Human extends Living
{
    void love();
}

class Dog implements Animal{
   
   public void speak()
    {
        System.out.println("BArking...");
    }
   
   
   public void walk()
   {
       System.out.println("4 Legs....");
   }
   
   
   public void attack()
   {
       System.out.println("Attacking....");
   }
}


public class test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
    }
}
