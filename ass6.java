import java.util.Scanner;

public class ass6{
    public static void main(final String args[]){
        final Scanner sc = new Scanner(System.in);
        final String str1 = sc.nextLine();
        final String str2 = sc.nextLine();
        int arr1[];
        int arr2[];
        arr1 = new int[26];
        arr2 = new int[26]; 
        
        for (int i= 0; i<str1.length();i++){
            arr1[str1.charAt(i)% 26] +=1;
        }
        for (int i =0; i<str2.length();i++){
            arr2[str2.charAt(i)%26] +=1;
        }
        int flag = 1;
        for ( int i=0 ;i<26;i++){
            if (arr1[i] == arr2[i]){
                flag =0;

            }
            else{
                System.out.println("Not Anagrams");
                flag = 1;
                break;
            }

        }
        if (flag == 0){
            System.out.println("Anagrams");
        }
    }

    }
