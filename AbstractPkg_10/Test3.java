package AbstractPkg_10;

abstract class Bank{
abstract int getRateOfInterest();
}

class SBI extends Bank{
int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
int getRateOfInterest(){return 9;}
}

class Test3{
public static void main(String args[]){
Bank b;
b = new SBI();
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());

b = new ICICI();
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());

b = new AXIS();
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
}
}