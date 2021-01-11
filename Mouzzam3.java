import java.io.*;
public class Mouzzam3
{
    public static void main(String []args) throws IOException
    {
         int i;
         FileInputStream fin;
         fin=new FileInputStream("./karan.txt");
         do{
             i=fin.read();
             if(i!=-1)
                  System.out.print((char)i);

         }while(i!=-1);
         fin.close();
        }
}