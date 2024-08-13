package patternsAssignment;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n = m/2;
        sc.close();

        int i = n;
        while(i>0){
            int j = 0;
            while (j<i) {
                System.out.print(" * ");
                j++;
            }
            j = 0;
            while (j<2*(n-i)+1) {
                System.out.print("   ");
                j++;
            }
            j = 0;
            while (j<i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();

            
            i--;
        }
        i = 0;
        while (i<n+1) {
            int j = 0;
            while (j<i) {
                System.out.print(" * ");
                j++;
            }
            j = 0;
            while (j<2*(n-i)+1) {
                System.out.print("   ");
                j++;
            }
            j = 0;
            while (j<i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();

            
            i++;
        }
        }

        
    }

