package patternsAssignment;

import java.util.Scanner;

public class Pattern25 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        int x = 0;
        for(int i = 0 ; i< n; i++){
            for(int j = 0; j< n-i; j++){
                System.out.print("   ");
            }
            for(int j = 0; j < 2*i + 1; j++){
                if(x<10){
                    System.out.print(" "+(x+1)+" ");
                }else{
                    System.out.print((x+1)+" ");
                }
               
                x++;
            }
            System.out.println();
        }
    }
}
