package Functions;
import java.util.Scanner;

public class exercise1 {
    public static void average(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.print("the average is: ");
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String x = sc.nextLine();
        average(a, b, c);
        System.out.println(x);
        sc.close();
    }
}
