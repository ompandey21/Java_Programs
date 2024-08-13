import java.util.Scanner;

public class BitM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            if(1<<i == n){
                System.out.println("The number is a power of 2");
                sc.close();
                return;
            }

        }
        System.out.println("Not");
        sc.close();

    }
}
