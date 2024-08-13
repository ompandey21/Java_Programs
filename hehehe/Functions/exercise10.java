import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int n = sc.nextInt();  
        if(n==1){
            System.out.println(a);
            sc.close();
            return;
        }else if(n==0){
            System.out.println(" ");
            sc.close();
            return;
        }
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i = 1; i<n-1; i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }  
        sc.close();                        
    }
}
