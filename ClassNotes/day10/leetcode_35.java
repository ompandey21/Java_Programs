package day10;

import java.util.Scanner;

public class leetcode_35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){ 
                left = mid +1;
                res = left;
                // System.out.println(res);
                }
            else {
                right = mid -1;
                res = right;
            }
            System.out.println(mid+" "+res);
        }
        if(res < 0 ) return 0;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchInsert(arr, target));
    }
}