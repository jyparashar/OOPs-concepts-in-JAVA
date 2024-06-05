package practice12;

import java.util.Scanner;

class Student
{
    private int roll;
    private String name;
    private double marks;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    
}


public class EncapsulationExample {

    public static void main(String[] args) {
       Student s1 = new Student();

    }
}
