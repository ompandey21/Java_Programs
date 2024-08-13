
import java.util.*;
public class Functions{
    public static int calculateSum(int n){
       int odd= 2*n+1;
        for(int i=1; i<=odd;i++){
            odd=odd+i;
        }
        
        return odd;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       
        System.out.println("the average is "+  calculateSum(n));
        sc.close();


    }

}
