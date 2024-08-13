package patternsAssignment;
import java.util.Scanner;

public class Pattern26 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        for(int i = 0 ; i< n; i++){
            for(int j = 0; j< n-i; j++){
                System.out.print("   ");
            }
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }
    }
}
