package Solving;
import java.util.Scanner;

public class solving3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for(int a = 0; a<4; a++){
            nums[a] = sc.nextInt();
        }
        int n = nums.length;
        boolean [] map = new boolean[n];
        int sum = 0;
        for(int i = 0; i<3; i++){
            int min = (int) Math.pow(10, 5);
            for(int j = 0; j<n; j++){
                
                if(map[j]!=true && nums[j]<min){
                    System.out.println(nums[j]);
                    min = nums[j];
                }
            }
            System.out.println("min:"+min);
            sum+=min;
        }
        System.out.println(sum);
    }
}
