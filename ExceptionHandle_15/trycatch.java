package ExceptionHandle_15;

import java.io.*;

public class trycatch {

    public static void main(String args[]) throws Exception {
        int age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter Your Age:");
            age = Integer.parseInt(br.readLine());

            if (age < 18) {
                throw new IOException();
            } else {
                throw new ArithmeticException();
            }
            //System.out.println("You can cast your Vote...");

        } catch (IOException e) {
            System.out.println("You are not eligible");

        } catch (ArithmeticException e) {
            System.out.println("You are eligible");

        }

    }

}
