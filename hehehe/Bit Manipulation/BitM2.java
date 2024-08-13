import java.util.Scanner;
//* Toogle bit at position */
public class BitM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();

        //* Get data at the position

        int bitmask = 1<<pos;
        int bit = bitmask & n;
        int res = 0;

        if (bit>0){
            //* Clear bit
           res = ~(bitmask) & n;
        }
        else{
        
           //* Set bit
           res = bitmask | n ;
        }
         
        System.out.println("The result is: "+res);
        sc.close();



    }
}
