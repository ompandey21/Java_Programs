package patternsAssignment;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while (i<n) {
            int j = 0; 
            while(j<n-i){
                System.out.print("   ");
                j++;
            }
            int k = 0;
            while (k<i*2 + 1) {
                if(k % 2 == 0){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" ! ");
                }
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
