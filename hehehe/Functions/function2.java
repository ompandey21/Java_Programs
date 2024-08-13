import java.util.Scanner;

public class function2 {
    public static int getProd(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("the product of given numbers is: ");
        System.out.print(getProd(a, b));
        sc.close();
    }
}
