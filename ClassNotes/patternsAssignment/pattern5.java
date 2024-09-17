package patternsAssignment;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m = n/2;

        for(int i = 0; i<m+1; i++){
            System.out.println();
            for(int j = 0; j<(m -i);j++){
                System.out.print("   ");
            }
            
            for(int j = 0; j<(2*i +1);j++){
                System.out.print(" * ");
            }
         
           
            
            
        }
        System.out.println();
        
        for(int i = m-1; i>=0; i--){
            
            for(int j = 0; j<(m -i);j++){
                System.out.print("   ");
            }
            
            for(int j = 0; j<(2*i +1);j++){
                System.out.print(" * ");
            }
         
           
            
            System.out.println();
        }
       
    }
}
