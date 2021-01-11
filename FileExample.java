import java.io.*;
public class FileExample
{
    public static void main(String []args) throws IOException
    {
        BufferedWriter bf = new BufferedWriter(new FileWriter("./name1.txt"));
        bf.write("mouzzam Siddiqui");
        bf.close();

    }
}