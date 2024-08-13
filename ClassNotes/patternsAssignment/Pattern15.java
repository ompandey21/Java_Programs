package patternsAssignment;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = n;
        while (i>0) {
            int j = 0;
            System.out.println();
            while (j<2*(n-i)) {
                System.out.print("   ");
                j++;
            }
            j =0;
            while (j < i) {
                System.out.print(" * ");
                j++;
            }
            
            i--;
        }
      
        int l = 1;  
        while (l<n+1) {
            int x = 0;
            while (x<2*(n-l)) {
                System.out.print("   ");
                x++;
            }
            x =0;
            while (x < l) {
                System.out.print(" * ");
                x++;
            }
            System.out.println();
            l++;
        }


    }
}
