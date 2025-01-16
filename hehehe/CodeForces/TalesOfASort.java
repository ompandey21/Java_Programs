package CodeForces;

import java.util.Scanner;

public class TalesOfASort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tests = 0; tests < t; tests++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int idx = -1;
            for(int i = n -1 ; i>0; i--){
                if(arr[i] < arr[i -1]){
                    idx = i;
                    break;
                }
            }
            if(idx == -1){
                System.out.println(0);
                continue;
            }
            int max = arr[0];
            for(int i = 1; i< idx; i++){
                max = Math.max(arr[i], max);
            }
            System.out.println(max);
            continue;
        }
    }
}
