package day5;

import java.util.Scanner;

public class codeForces3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(m>n){
                System.out.println("No");
                continue;
            }
            else if(m == n){
                System.out.println("Yes");
                continue;
            }
            int h = 0;
            for(int j = 0; j<n; j++){
                if(h>m){
                    h--;
                }else{
                    h++;
                }
            }
            if(h == m){
               
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
    }
}
