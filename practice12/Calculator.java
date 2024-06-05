package practice12;
 class Calculator
{
     String name;
     int id;
     
     void setValues(String name, int id)
     {
         this.name = name;
         this.id = id;
     }
    
     void display()
     {
         System.out.println("Name:"+name+" ID :"+id);
     }
     
     public static void main(String[] args) {
         Calculator c1= new Calculator();
         c1.setValues("Diya", 1);
         c1.display();
     }
}
