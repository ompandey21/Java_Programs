package day2;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = row;
        int spaces = n - row;
        while(row<=n){
            int i = 1;
            while(i<=spaces){
                System.out.print("   ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print(" * ");
                j++;
            }
            row++;
            star++;
            spaces--;
            System.out.println();
        }
    }
}
