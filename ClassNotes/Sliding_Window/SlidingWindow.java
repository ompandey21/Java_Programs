package Sliding_Window;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findMaxSum(n, nums, k));
    }
    public static int findMaxSum(int n, int[] arr, int k) {
        int left = 0;
        int right = k;
        int sum = 0;
        for(int i = left; i<right; i++){
            sum+=arr[i];
        }
        int maxSum = sum;
        while(right < n){
            sum-=arr[left];
            sum+=arr[right];
            maxSum = Math.max(sum, maxSum);
            left++;
            right++;
        }
        return maxSum;
    }
}

// non repeating character in a array
// non repeating character in a array
// 187, 30, 340, 395, 424, 438, 
