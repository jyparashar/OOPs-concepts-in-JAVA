package practice12;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();

        System.out.println("Enter b: ");
        b = sc.nextInt();

        System.out.println("Enter c: ");
        c = sc.nextInt();

        if (a == b && a == c && b == c)
        {
            System.out.println("Equilateral");
        }
        else if (a == b || a == c || b == c)
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("Scalene");
        }
    }
}
