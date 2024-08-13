import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i<n+1; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = n-i+1; j>0; j--){
                System.out.print("*");
            }
            for(int j = n-i+1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
