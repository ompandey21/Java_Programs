package day4;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        int modVal = 1;

        while(n%modVal < n){
            i++;
            modVal*=10;
        }
        int sum = 0;
        String s = String.valueOf(n);
        System.out.println(s);
        for(int f = 0; f<i; f++){
        
            sum+=(int)Math.pow((s.charAt(f)- '0'), i);
        }
        if(sum == n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
