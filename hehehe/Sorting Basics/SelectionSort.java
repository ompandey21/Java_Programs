public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,6,3,8,2,1,9};

        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j= i; j<arr.length-1; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        for(int i = 0; i<arr.length; i++){ 
            System.out.println(arr[i]);
        }
        

    }
}
