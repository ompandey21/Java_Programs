import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        max = nums[0];
        min = nums[0];
        for(int i = 0; i<n; i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
            

        }
        System.out.println("The maximum of numbers is "+max+" and the minimum is "+min);
        sc.close();
    }
}
