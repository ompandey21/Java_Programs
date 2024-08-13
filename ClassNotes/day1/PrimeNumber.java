package day1;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        for( int i = 2; i<n/2 + 1; i++ ){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();

    }
}
