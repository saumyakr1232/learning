import java.util.*;


public class asses_4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String email_id =sc.nextLine();

        if (email_id.contains("@") && email_id.contains(".") && email_id.length() >= 5){
                String user_id[] = email_id.split("@");
                String[]  ser_add = user_id[1].split("\\.");
                if (ser_add[0].length() >2){
                    System.out.println("Valid Email");
                }
                else{
                    System.out.println("Invalid Email");
                }
        
        }
        else {
            System.out.println("Invalid Email");
        }
    }
}
