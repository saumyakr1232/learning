

import java.util.*;
public class asses_2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();

        String word[] = name.split(" ");
        System.out.print(word[0].toUpperCase().charAt(0));
        System.out.print(' ');
        System.out.print(word[word.length-1].toUpperCase().charAt(0));
        System.out.print(word[word.length-1].substring(1,word[word.length-1].length()));
        
    }
  
}
