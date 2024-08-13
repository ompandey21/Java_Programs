
public class bubbleSort {

    public static void main(String[] args) {
        int arr[] = {1,3,7,8,2,5};

    //*Bubble sort using nested loops the first loop runs (n-1) times while 
    //*the inner loops starts from n-1 and afterward reduced by 1 in each iteration
    //!Time complexity = O(n^2) 

        for(int i = 0; i< arr.length -1 ; i++){
            for(int j  = 0; j< arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }



    
}
}