import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println();
        int nums[] = new int[n];
        System.out.println("Enter the array elements: ");

        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find: ");
        int m = sc.nextInt();
        for(int i = 0; i<n; i++){
            if(nums[i] == m){
                System.out.println("The index of "+m+" is "+i);
                sc.close();
                return;
            }
        }
        System.out.println("The number "+m+" does not exist in the array.");
        sc.close();


    }
}