import java.io.*;
import java.util.*;
public class Mouzzam2
{
    public static void main(String []args) throws IOException
    {
        int i;
        FileOutputStream fout=new FileOutputStream("./Karan.txt",true);
    
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       char ch[]=s.toCharArray();
       for(i=0;i<s.length(); i++)
           fout.write(ch[i]);
        fout.close();
    }
}