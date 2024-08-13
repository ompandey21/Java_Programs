package patternsAssignment;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i =0; i<n; i++){
            for( int j = n; j> i; j--){
                if(j == i+1){
                    System.out.print(" * ");
                }else{
                    System.out.print(" "+j+" ");
                }

            }
            for(int j = i; j>0; j--){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
