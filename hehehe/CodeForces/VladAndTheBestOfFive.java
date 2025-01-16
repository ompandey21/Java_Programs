package CodeForces;

import java.util.Scanner;

public class VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            String s = sc.next();
            int count = 1; 
            char el = s.charAt(0);
            for(int j = 1; j< s.length(); j++){
                if(s.charAt(j) == el){
                    count++;
                }else count--;

                if(count == 0){
                    el = s.charAt(j);
                    count = 1;
                }
            }
            System.out.println(el);
        }
        
    }
}
