import java.io.*;
public class Mouzzam1
{
     public static void main(String []args) throws IOException
     {
         File f1=new File("./karan.txt");
         f1.createNewFile();
         System.out.println("Is File Exist:"+f1.exists());
         System.out.println("Is We can Write in this file:" + f1.canWrite());
         System.out.println("Size of the file:" + f1.length());
         f1.delete();
         System.out.println("Is File Exist:" + f1.exists());


     }
}
