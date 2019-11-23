import java.util.Scanner;
public class main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 !=0){
            int t = (int)Math.pow(2,(n/2));
            System.out.print(t);
        }
        else{
            int t = (int) Math.pow(3,(n/2)-1);
            System.out.print(t);
        }
    }
}