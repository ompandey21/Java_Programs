package day2;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=n-row){
                System.out.print("   ");
                i++;
            }
            int j = 0;
            while(j<2*row-1){ 
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            row++;
        }
    }
}
