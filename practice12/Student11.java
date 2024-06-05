package practice12;

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void show()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student11 extends Person
{
    int StudentID;

    Student11(String name, int age, int StudentID)
    {
        super(name, age);
        this.StudentID = StudentID;
    }

    void show()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("StudentID: " + StudentID);
    }

    public static void main(String[] args)
    {
        Person p = new Person("Diya", 11);
        p.show();

        Student11 obj = new Student11("Ravi", 9, 111);
        obj.show();
    }

}
