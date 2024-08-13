import java.util.Scanner;

//Palindromic pyramid pattern
public class AdvancedPattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for (int j = n-i-1; j >=0; j--) {
                System.out.print("  ");
            }
            for(int j = i; j>0; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
