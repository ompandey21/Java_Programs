package Solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solving2 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int rowAdder = 0;
        int colAdder = 1;
        int round = 0;
        int counter = 0;
        int i = 0;
        int j = 0;
        while(counter<m*n){

            res.add(matrix[i][j]);
            // System.out.println(i+" "+j);
            System.out.println(matrix[i][j]);
            counter++;
            if(i == round+1 && j == round){
                colAdder = 1;
                rowAdder = 0;
                round++;
            }
            if(i == round && j == n - round - 1){
                colAdder = 0;
                rowAdder = 1;
            }
            if(i == m - round - 1 && j == n - round - 1){
                colAdder = -1;
                rowAdder = 0;
            }
            // if()
            if(i == m-round-1 && j == round){
                colAdder = 0;
                rowAdder = -1;
            }
            i+=rowAdder;
            j+=colAdder;
            
        }
      
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        List<Integer> li = spiralOrder(matrix);
        System.out.println(li);
    }
}
