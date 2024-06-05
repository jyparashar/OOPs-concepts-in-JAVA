package ExceptionHandle_15;

import java.io.*;

public class multicatch {

    void takeage() {
        int age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter your age:");
            age = Integer.parseInt(br.readLine());
            if (age < 18) {
                throw new IOException("Not Eligible");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        multicatch m1 = new multicatch();
        m1.takeage();

    }
}
