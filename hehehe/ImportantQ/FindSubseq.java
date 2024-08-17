package ImportantQ;

import java.util.Scanner;

public class FindSubseq {
    public static void subsequences(String s, String newString, int i){
        if(i == s.length()){
            System.out.println(newString);
            return;
        }

        char current = s.charAt(i);

        //is added
        subsequences(s, newString+current, i+1);

        //is not added
        subsequences(s, newString, i+1);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subsequences(s, "", 0);
        
        sc.close();
       
        

        
    }
}
