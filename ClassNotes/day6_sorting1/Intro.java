package day6_sorting1;

public class Intro {
     //? Bubble sort -> the maximum element is pushed to the end (before the last max) in each iteration -> O(n^2)
    public static void bubbleSort(int[] arr){
        for(int i = 1; i<arr.length ; i++){
            for(int j = 0; j< arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //? Selection Sort -> find the min from ith index and swap it with i... -> O(n^2)
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1 ; i++){
            int j = min_from_ith_index(arr, i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
    
    public static int min_from_ith_index(int[] arr, int i){
        int min = arr[i];
        int idx = i;
        for(int j = i+1;j< arr.length; j++){
            if(arr[j] < min){
                min = arr[j]; 
                idx = j;
            }
        }
        return idx;
    }
       
    public static void main(String[] args) {
       int [] arr = {1,5,2,1, -1, 2, 3,5};
       System.out.println(min_from_ith_index(arr, 2));
       selectionSort(arr);
       for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
       }
       
       
        

    }
}
