package ImportantQ;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubseq {
    public static void uniqueSubsequences(String s, String newString, HashSet<String> set, int i){
        if(i == s.length()){
            if(!set.contains(newString)){
                set.add(newString);
                System.out.println(newString);
                
            }
           
            return;
        }

        char current = s.charAt(i);

        //is added
        uniqueSubsequences(s, newString+current, set, i+1);

        //is not added
        uniqueSubsequences(s, newString, set, i+1);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet <String> set = new HashSet<>();
        uniqueSubsequences(s, "", set, 0);
        
        sc.close();
       
        

        
    }
}
