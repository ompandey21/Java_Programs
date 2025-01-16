package day8;
import java.util.*;
public class RotateMatrix {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
       int m = scn.nextInt();
       int[][] arr=new int[m][m];
       for (int i=0; i<m; i++){
              for(int j=0; j<m; j++){
                    arr[i][j]=scn.nextInt();
               }
        }
        rotateImage(arr,m);
   }
   public static void rotateImage(int[][] matrix, int m) {
       int left = 0;
       int top = 0;
       int bottom = m - 1;
       int count  = 0;
       int right  = m - 1;
    //    System.out.println(right);
       while(left <= right){
           for(int i = top; i<=bottom && count < m*m; i++){
               System.out.print(matrix[i][right]+" ");
            //    System.out.print(i +" "+right+" ");
               count++;
           }
           System.out.println();
           right--;
       }
   }
}
