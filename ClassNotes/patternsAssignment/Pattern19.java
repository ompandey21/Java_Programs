package patternsAssignment;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m = n/2;

        for(int i = 0; i<m+1; i++){
            System.out.println();
            for(int j = 0; j<(m +1 -i);j++){
                System.out.print(" * ");
            }
            
            for(int j = 0; j<(2*i - 1);j++){
                System.out.print("   ");
            }
         
            if(i == 0){
                for(int j = 0; j<(m-i);j++){
                    System.out.print(" * ");
                }
            }
            else{
                for(int j = 0; j<(m + 1 -i);j++){
                    System.out.print(" * ");
                }
            }
            
            
        }
        System.out.println();
        for(int i = m-1; i>=0; i--){
            
                for(int j = 0; j<(m +1 -i);j++){
                    System.out.print(" * ");
                }
                
                for(int j = 0; j<(2*i - 1);j++){
                    System.out.print("   ");
                }
             
                if(i == 0){
                    for(int j = 0; j<(m-i);j++){
                        System.out.print(" * ");
                    }
                }
                else{
                    for(int j = 0; j<(m + 1 -i);j++){
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            
            
        }
    }
}
