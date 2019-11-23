import java.util.Scanner;

public class ass7{

    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    String arr[];
    int n = sc.nextInt();
    n = n+1;
    arr = new String[n];

    for (int i=0 ;i<n;i++){
        arr[i]=sc.nextLine();
      //  System.out.println(i);
    }
    for (int i = 0; i<n; i++){
        if (arr[i].length()>8 && arr.length < 30){
            if(Character.isDigit(arr[i].charAt(0))){
                System.out.println("Invalid");
            }
            else if (arr[i].matches("^[a-zA-Z0-9'_']*$")){
                System.out.println("Valid");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }



    }
}