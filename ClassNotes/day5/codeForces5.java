package day5;

import java.util.Scanner;

public class codeForces5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diffA = a - 1;
            int diffB = Math.abs(c-b)+(c-1);
            if(diffA>diffB){
                System.out.println(2);
            }else if(diffA == diffB){
                System.out.println(3);
            }else{
                System.out.println(1);
            }
        }
        sc.close();
    }
}
