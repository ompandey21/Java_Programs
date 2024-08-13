package patternsAssignment;

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        for(int i = 0 ; i< n; i++){
            for(int j = 0; j< n-i; j++){
                System.out.print("   ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" "+(j+1)+" ");
            }
            for(int j = i-1; j >= 0; j--){
                System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }
    }
}
