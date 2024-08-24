package ImportantQ;

import java.util.Scanner;

public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombinations(String s, String newStr, int i) {
        if(i == s.length()){
            System.out.println(newStr);
            return;
        }
        char current = s.charAt(i);
        int currentNum = Character.getNumericValue(current);
        int j = 0;
        while(j<keypad[currentNum].length()){
            printCombinations(s, newStr+keypad[currentNum].charAt(j), i+1);
            j++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        printCombinations(s, "", 0);

    }
}
