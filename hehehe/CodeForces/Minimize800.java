package CodeForces;

import java.util.Scanner;

public class Minimize800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        int i = 0;
        while(i<t){
            short a = sc.nextShort();
            short b = sc.nextShort();
            System.out.println(b-a);
            i++;
        }
        sc.close();
    }
}
