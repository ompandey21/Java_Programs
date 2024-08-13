package patternsAssignment;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while(i<n){
            if(i == 0 || i == n-1){
                int j = 0; 
                while(j<n){
                    System.out.print(" * ");
                    j++;
                }
                System.out.println();
            }
            else{
                int j = 0;
                while(j<n){
                    if(j == 0 || j == n-1){
                        System.out.print(" * ");
                        
                    }
                    else{
                        System.out.print("   ");

                    }
                    j++;
                }
                System.out.println();
            }

            i++;
        }

    }
}
