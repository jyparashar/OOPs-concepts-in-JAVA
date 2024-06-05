package practice12;

class living{
    
 void speaks(){
     System.out.println("create sound");
 }
    
}

class Human extends living
{
   void speaks(String n)
   {
       System.out.println("Speaks language"+n);
   }
   
   public static void main(String args[])
   {
       Human h=new Human();
       h.speaks();
       h.speaks("HINDI");

      
       if(h instanceof living && h instanceof Human)
       {
           System.out.println("OK");
       }
       else
       {
           System.out.println("Not OK");
       }
   }
    
}
