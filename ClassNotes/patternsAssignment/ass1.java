package patternsAssignment;

import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int mod_val = 1;
        int sum_odd = 0;
        int sum_even = 0;
        int prev = 0;
        int i = 1;
        while((n%mod_val)<n){
            mod_val*=10;
            if(i % 2 == 0){
                sum_even+=((n%mod_val - prev));
                prev =  n%mod_val;
            }else{
                sum_odd+=((n%mod_val - prev)*10/mod_val);
                prev =  n%mod_val;
            }
            i++;
            

        }
        
        System.out.println(sum_even);
        System.out.println(sum_odd);
    }
}
