package day3;

import java.util.Scanner;

public class numberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fromBase = sc.nextInt();
        int toBase = sc.nextInt();
        int mul = 1;
        int sum = 0;
        sc.close();
        while(n>0){
            int r = n%toBase;
            n/=toBase;
            
            sum+=r*mul;
            mul*=fromBase;
        }
        System.out.println(sum);
    }
}
