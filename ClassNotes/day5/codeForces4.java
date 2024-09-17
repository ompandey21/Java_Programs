package day5;

import java.util.Scanner;

public class codeForces4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b<a*2){
                System.out.println((n/2)*b + (n%2)*a);
            }else{
                System.out.println(n*a);
            }
        }sc.close();
    }
}
