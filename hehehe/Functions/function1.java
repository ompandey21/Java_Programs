import java.util.Scanner;

public class function1 {
    public static int getSum(int a, int b) {
        return a+b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        getSum(a,b);
        System.out.println(getSum(a, b));
        sc.close();
}
    
}