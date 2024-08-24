package RecursionAdvanced;

import java.util.Scanner;

public class Permutations {
    public static void findPermutations(String s, String perm) {
        if(s.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            String newStr = s.substring(0, i)+s.substring(i+1);
            findPermutations(newStr, perm+c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        findPermutations(str, "");

    }
}
