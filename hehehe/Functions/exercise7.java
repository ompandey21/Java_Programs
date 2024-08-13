import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numZeros = 0;
        int numPositive = 0;
        int numNegative = 0;
        System.out.println("Enter the number (type 'x' to exit): ");
        while (true) {
            try {
                int num = sc.nextInt();
                if(num>0){
                    numPositive++;
                }else if(num==0){
                    numZeros++;
                }else{
                    numNegative++;
                }
            } catch (Exception as ) {
                sc.close();
                System.out.println("Number of zeros : "+numZeros);
                System.out.println("Number of positive : "+numPositive);
                System.out.println("Number of negative : "+numNegative);
                System.out.println("\n"+as);
                break;
            }
        }
    }
}
