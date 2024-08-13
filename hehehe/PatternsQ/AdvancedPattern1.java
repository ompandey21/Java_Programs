import java.util.*;

//Butterfly Pattern
public class AdvancedPattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j = ((n-i)*2)-1; j>0; j = j-2){
                System.out.print("    ");

            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            

            System.out.println();

        }
        for(int i = n; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j = ((n-i)*2)-1; j>0; j = j-2){
                System.out.print("    ");

            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            

            System.out.println();

        }
        sc.close();
    
    }
    
}

