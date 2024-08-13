package patternsAssignment;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    for(int i = 0; i<n; i++){
        for(int j =0; j<2*i +1; j++){
            if(j%2 == 0){
                System.out.print(" "+(i+1)+" ");
            }else{
                System.out.print(" * "  );
            }
        }
        System.out.println();
    }
    for(int i = n-2; i>=0; i--){
        for(int j =0; j<2*i +1; j++){
            if(j%2 == 0){
                System.out.print(" "+(i+1)+" ");
            }else{
                System.out.print(" * "  );
            }
        }
        System.out.println();
    }
    
    }
    
    

}
