package ExceptionHandle_15;

public class trycatch {
        public static void main(String args[]) {
            try {
                // Code that might throw an exception
                int a = 10, b = 0;
                int result = a / b; // Arithmetic exception
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Code to handle the exception
                System.out.println("Error: " + e.getMessage());
            }
        }
}