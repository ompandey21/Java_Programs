package day5;

import java.util.Arrays;

public class Searching {

    public static void main(String[] args) {
        // int[][] matrix = {{2,1}, {5,4}, {3,7},{9, 8}};
        int[] matrix = {1,2,5,12,4,2};
        Arrays.sort(matrix);
        // for(int i = 0; i<4; i++){
        //     for(int j = 0; j< 2; j++){
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }
        for(int j = 0; j< 6; j++){
                    System.out.print(matrix[j]);
                }
                System.out.println();
    }
}
