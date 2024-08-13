package patternsAssignment;

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 0; i<n; i++){
            for(int j =0; j<n-i -1; j++){
                System.out.print("   ");
            }
            for(int j = n - i; j<=n; j++){
                System.out.print(" "+j%10+" ");
            }
            for(int j = n-1; j>=n - i; j--){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
   
    
}

