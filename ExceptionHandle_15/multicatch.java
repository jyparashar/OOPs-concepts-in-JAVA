package ExceptionHandle_15;

import java.io.*;

public class multicatch {
    public static void main(String[] args) throws Exception {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
