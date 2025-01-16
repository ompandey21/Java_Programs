package ArraysQ.;

import java.util.*;
class Searching{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [][] arr = {{12,13},{7,6},{15,14}};
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
