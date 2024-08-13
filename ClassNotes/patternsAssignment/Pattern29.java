package patternsAssignment;

import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        for(int i = 0 ; i< n; i++){
            for(int j = 0; j< n-i; j++){
                System.out.print("   ");
            }
            for(int j = 1; j <= (2*i )+ 1; j++){
                if(j == 1 || j == 2*i+1){
                    System.out.print(" "+(i+1)+" ");
                }else{
                    System.out.print(" "+0+" ");
                }
            }
            System.out.println();
        }
    }
}
