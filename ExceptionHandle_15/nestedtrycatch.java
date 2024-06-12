package ExceptionHandle_15;

public class nestedtrycatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Entering outer try block");
            int[] numbers = {1, 2, 3, 4, 5};
            int a = 10;
            int b = 0;

            // Nested try block
            try {
                System.out.println("Entering nested try block");
                System.out.println("Attempting to access element at index 5: " + numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught in nested try block: " + e);
            }

            System.out.println("Attempting division by zero");
            int result = a / b;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in outer try block: " + e);
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program execution finished");
    }
}
