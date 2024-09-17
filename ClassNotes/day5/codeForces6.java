package day5;

import java.util.Scanner;

public class codeForces6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String map = "1234567890";
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int cursor = 0;
            int steps = 0;
            for (int j = 0; j < s.length(); j++) {
                int next = map.indexOf(s.charAt(j));
                steps += Math.abs(next - cursor)+1;
                cursor = next;
            }
            System.out.println(steps);
        }
    }
}
