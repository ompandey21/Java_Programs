import java.util.Scanner;

public class exercise3 {
    public static int greaterNum(int a, int b){
        if(a>b){
            return a;
        }
        else if(a==b){
            return 0;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int n = greaterNum(a, b);
        if (n==0) {
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println(n+" is greater of the two numbers!");
        }
        sc.close();
    }
}
