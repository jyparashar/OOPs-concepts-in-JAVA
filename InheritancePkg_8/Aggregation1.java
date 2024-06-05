package InheritancePkg_8;
class Address
{
    int hno;
    String area, city, state;
    
    Address(int hno, String area, String city, String state)
    {
        this.hno = hno;
        this.area = area;
        this.city = city;
        this.state = state;
    }
}

class Student
{
    Address a1;
    String subject;
    
    Student(Address a1, String subject)
    {
        this.a1 = a1;
        this.subject = subject;
    }
    
    void show()
    {
        System.out.println(a1.hno + " " + a1.area + " " + subject);
    }
}

public class Aggregation1
{
    public static void main(String[] args) {
        
        Address a1 = new Address(100, "Sec-7", "Agra", "UP");
        Student s1 = new Student(a1, "WT");
        
        s1.show();
    }
}
