package day7;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        //? Binary Search on ARRAY
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5, 13, 16, 18, 20, 22, 24, 26};
        int t = sc.nextInt();
        sc.close();  
        int low = 0;
        int high = arr.length;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == t){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < t){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

    }
}
