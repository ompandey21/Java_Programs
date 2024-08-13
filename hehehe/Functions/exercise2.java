import java.util.Scanner;

public class exercise2 {
    public static void oddSum(int n){
        int s = 0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                s = s+i;
            }
        }
        System.out.println("The sum of odd numbers from "+1+" to "+n+" is "+s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddSum(n);
        sc.close();
    }
}
