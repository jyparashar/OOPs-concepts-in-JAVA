package ClassObjects_4;

public class simpleclass2 { 
 int le;
 int wi;

 void setvalues(int l,int w)
 {
  le=l;
  wi=w;
 }

 void calculateArea()
 {
     System.out.println(le * wi);
 }

 public static void main(String args[]){
  simpleclass2 r1=new simpleclass2();
 
  r1.setvalues(11,5);

  r1.calculateArea();

}

}
