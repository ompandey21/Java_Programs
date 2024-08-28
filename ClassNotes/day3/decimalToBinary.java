package day3;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int mul = 1;
        int sum = 0;
        sc.close();
        while(n>0){
            int r = n%2;
            n/=2;
            
            sum+=r*mul;
            mul*=10;
        }
        System.out.println(sum);
    }
}
