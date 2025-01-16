package Recursion;

import java.util.Scanner;

public class Permutationss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        findPermutation(s, "");
    }
    public static void findPermutation(String s, String prm) {
        if(s.length() == 0){
            System.out.println(prm);
            return;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            findPermutation(newStr, prm+ch);

        }
    }
}
