import java.util.Scanner;

public class Array2D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Enter the number to find in the matrix: ");
        int m = sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(matrix[i][j]==m){
                    System.out.println("The number "+m+" is located in row "+i+" and "+" column "+j);
                }
            }
        }
        sc.close();
        
    }
}
