package Solving;

public class solving1 {
    public int getRemaining(int[] array, int n, boolean isOdd){
        int [] newArr = new int[n/2];
        
        if(n == 1){
            return newArr[0];
        }
        int idx = 0;
        for(int i = 0; i<n; i++){
            if(isOdd){
                if(i%2 != 0){
                    array[idx] = i;
                    idx++;
                }
            }
            if(!isOdd && i%2 == 0){
                array[idx] = i;
                idx++;
            }
        }
        return getRemaining(newArr, n/2, !isOdd);
        }
    
    public int lastRemaining(int n) {
        if(n == 1){
            return n;
        }
        int [] arr = new int[n/2];
        int i =0;
        while(i<n/2){
            arr[i] = (i+1)*2;
        }
        return getRemaining(arr, n/2, false);
        

        
    }
}
