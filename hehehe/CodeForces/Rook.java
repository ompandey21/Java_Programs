package CodeForces;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        for(int tests = 0; tests<t; tests++){
            String s = sc.next();
            char column = s.charAt(0);
            int row = s.charAt(1) - '0';
            String map = "abcdefgh";
            
            for(int i = row+1; i < row + 8; i++){
                String box = "";
                if(i >8){
                    box = column + String.valueOf(i%8);
                }else{
                    box = column + String.valueOf(i);
                }
                
                System.out.println(box);
            }
            int colIdx = map.indexOf(column);
            for(int i = colIdx +1; i < colIdx + 8; i++){
                String box = map.charAt(i%8) + String.valueOf(row);
                System.out.println(box);
                
            }
        }
    }
}
