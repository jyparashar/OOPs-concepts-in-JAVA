package Streams_16;

import java.io.*;
public class ByteStreamExample
{
    public static void main(String[] args) throws IOException {
        FileInputStream source = null;
        FileOutputStream target = null;
        try
        {
            source = new FileInputStream("source.txt");
            target = new FileOutputStream("target.txt");

            int temp;
            while ((temp = source.read())!= -1)
            {
                target.write((byte)temp);
            }
        }
        catch (FileNotFoundException ex)
        {
            throw new RuntimeException(ex);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            if (source != null) {
            source.close();
        }
            if (target != null) {
            target.close();
        }
        }
    }
}
