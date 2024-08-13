package patternsAssignment;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<n){
                if(i == j || i == n - 1 -  j){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                j++;
            }
            System.out.println();
            i++;

        }

    }
}
