package KeywordsPkg_7;

class staticmethod{
     int rollno;
     String name;
     static String college = "HCST";
   
     static void change()
     {
    	 college = "AEC";
     }

     staticmethod(int r, String n){
     rollno = r;
     name = n;
     }
     
     void display ()
     {
    	 System.out.println(rollno+" "+name+" "+college);
     }

    public static void main(String args[]){

    staticmethod s1 = new staticmethod (111,"Karan");
    staticmethod s2 = new staticmethod (222,"Uday");
    staticmethod s3 = new staticmethod (333,"Manav");

    s1.display();
    s2.display();
    change();
    s3.display();
    }
}