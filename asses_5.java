import java.util.Scanner;

public class asses_5{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of elements :");
        int n = sc.nextInt();   //Taking number of element as input from user
        String ele[] = new String[n];
        //System.out.println("Enter the string element :");
        for (int i=0 ; i<n; i=i+1){              //taking string input as element of array
            String s = sc.next();
            if (s.length()>= 2 && s.length()<= 100 && s.matches("^[a-z]*$")){
                ele[i] = s;
                //System.out.println(s+'*');
            }

        }
        //for (int i=0;i<n;i=i+1){
          //  System.out.print(ele[i]+ "    ");
       // }
        System.out.println(rules(ele, n));


    }
    public static int rules(String[] arr, int n){
        int flag = -1;
        for (int i= 0;i <n-1 ;i++){
            
           if(arr[i].charAt(arr[i].length()-1) == arr[i+1].charAt(0)){
                flag= 1;
           }
           else{
               flag = -1;
               break;
           }
        }
        return flag;
    }
}