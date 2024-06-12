package Streams_16;

import java.io.*;
public class CharStreamExample {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("./src/input.txt");
            out = new FileWriter("./src/output.txt");
            int c;
            while((c = in.read()) != -1)
            {
                System.out.println((char)c);
                out.write(c);
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
