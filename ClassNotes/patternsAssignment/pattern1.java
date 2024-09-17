package patternsAssignment;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    int i = 0;
    while(i<n){
        int x = 0;
        while(x<n-i+1){
        System.out.print("  ");
        x++;
        }
        int j = n - i;
        while(j<=n){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
        i++;
    }
    
}
}

