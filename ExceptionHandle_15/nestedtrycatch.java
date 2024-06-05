package ExceptionHandle_15;

import java.io.*;

public class nestedtrycatch {

    public static void main(String[] args) throws Exception {
        int age, cnt;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter your age:");
            age = Integer.parseInt(br.readLine());
            if (age < 18) {
                throw new IOException("Not Eligible");
            }
            try {
                System.out.println("Enter count:");
                cnt = Integer.parseInt(br.readLine());
                if (cnt > 1) {
                    throw new Exception("Cannot cast your vote");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {

            System.out.println(e.getMessage());
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
