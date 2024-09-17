package day5;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int i = 0;
        while(i<t){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            i++;
            if(a%b == 0){
                System.out.println(0);
            }else{
            System.out.println(b-(a%b));
            }
        }
        sc.close();
    }
}
