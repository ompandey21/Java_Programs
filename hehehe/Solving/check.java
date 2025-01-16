package Solving;

import java.util.Arrays;
import java.util.Scanner;

public class check {
    public static void main(String args[]) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();

        Arrays.sort(arr);
        for(int i = 0; i<n-2; i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left < right){
                System.out.println(i+" "+ left+" "+ right);
                int sum = arr[i] + arr[left] + arr[right];
                System.out.println(sum);
                if(sum == target){
                    System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
                    while(left<right && arr[left] == arr[left+1]) left++;
                    while(left<right && arr[right] == arr[right-1]) right--;
                }
                if(sum < target){
                    left ++;
                }else{
                    right--;
                }
            }
        }
    }
}


