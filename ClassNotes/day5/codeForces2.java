package day5;

import java.util.Scanner;

public class codeForces2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        String nums = "123";
        for(int i = 0; i<nums.length(); i++){
            int x = nums.charAt(i)-'0';
            if(x!=a && x!=b){
                System.out.println(x);
                return;
            }
        }
    }
}
