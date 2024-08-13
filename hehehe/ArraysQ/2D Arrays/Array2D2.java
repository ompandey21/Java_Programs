import java.util.Scanner;
// *Spiral Matrix
public class Array2D2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and cols: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The spiral form of the given matrix is: ");
        while (rowStart<=rowEnd && colStart<=colEnd) {
            for(int i = colStart; i<=colEnd; i++){
                System.out.print(matrix[rowStart][i]+" ");
            }
            rowStart = rowStart + 1;
            for(int i = rowStart; i<=rowEnd; i++){
                System.out.print(matrix[i][colEnd]+" ");
            }
            colEnd = colEnd - 1;
            for(int i = colEnd; i>=colStart; i--){
                System.out.print(matrix[rowEnd][i]+" ");
            }
            rowEnd = rowEnd - 1;
            for(int i = rowEnd; i>= rowStart; i--){
                System.out.print(matrix[i][colStart]+" ");
            }
            colStart = colStart + 1;
        }
    }
}