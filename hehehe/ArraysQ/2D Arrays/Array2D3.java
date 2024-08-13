import java.util.Scanner;

public class Array2D3 {
    //*Transpose of a matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
