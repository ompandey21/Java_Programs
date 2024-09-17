package Solving;

import java.util.Scanner;

public class check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int res = 0;
        for(int i = s.length()-1; i>=0;i--){
            int p = s.charAt(i) - '0';
            res+= (int)(s.length()-i)*Math.pow(10, p-1);
        }
        System.out.println(res);
        
    }
}


