package ExceptionHandle_15;

import java.io.IOException;

public class student {
    void checkAge(int age, int count) throws IOException, Exception
    {
        if (age < 18)
        {
            throw new IOException("Age cant be less than 18");
        }
        else
        {
            if (count == 1)
            {
                throw new Exception("Already casted the vote");
            }
            else
            {
                System.out.println("Welcome to Voting System");
            }
        }
    }

    void castVote()
    {
        try
        {
            checkAge(9, 0);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        student s1 = new student();
        s1.castVote();
    }
}
