import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i<n; i++){
            nums[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i = 0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                flag = false;
            }
        }
        if(flag){
            System.out.println("The array is in ascending order!");
        }
        else{
            System.out.println("The array is not in ascending order!");
        }
        sc.close();
    }
}
