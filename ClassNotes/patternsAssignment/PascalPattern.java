package patternsAssignment;

import java.util.Scanner;

public class PascalPattern {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 0;
        while(row<n) {
            int number = 1;
            int j = 0;
            while (j <= row) {
                System.out.print(number + "\t");
                System.out.println("row:"+row);
                System.out.println("j:"+j);
                System.out.println("pehle:"+number);
                number = number * (row - j) / (j + 1);
                System.out.println("baadme"+number);

                j++;
            }
            System.out.println();
            row++;
        }
        scanner.close();
    }
}
