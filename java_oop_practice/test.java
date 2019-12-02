import java.util.Scanner;
public class test{

    public static void main(String [] args){
        int a = 12;
        float b = 3.9f;
        double d = a / b ;
        int lol =  a /(int) b;
        byte t = 34;
        int hexa = 1000;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        a = Integer.parseInt(s);
        char c ='a';
        int l = (int) c;
        System.out.println(l);

        System.out.println(d);
        System.out.println(t);
        System.out.println(lol);
        System.out.println(hexa);

    }
}