import java.util.*;

// Number pyramid
public class AdvancedPattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i<=n; i++){
            for(int j = n-i-1; j>=0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
