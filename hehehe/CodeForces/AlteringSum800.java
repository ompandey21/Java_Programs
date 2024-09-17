package hehehe.CodeForces;

import java.util.Scanner;

public class AlteringSum800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i<t){
            int n = sc.nextInt();
            int sum = 0;
            for(int j = 0; j<n;j++){
                if(j%2 == 0){
                    sum+=sc.nextInt();
                }
                else{
                    sum-= sc.nextInt();
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
