package day6_sorting1;

public class InsertLastElement {
    public static void sort(int [] arr, int i){
        int item = arr[i];
        int j = i - 1;
        while( j >=0 && arr[j] > item){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
    }
    public static void InsertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            sort(arr, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,-7, 2,3};
        InsertionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
