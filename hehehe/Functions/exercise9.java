import java.util.Scanner;
// Greatest common divisor
public class exercise9 {
    public static int findLCM(int a, int b)
    {
        int lar = Math.max(a, b);
        int small = Math.min(a, b);
        for (int i = lar; ; i += lar) {
            if (i % small == 0)
                return i;
        }
    }
    public static int findGCD(int a, int b){
        int lcm = findLCM(a, b);
        return (a*b)/lcm ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The gcd of "+a+" and "+b+" is "+findGCD(a, b));
        sc.close();
    }
}
