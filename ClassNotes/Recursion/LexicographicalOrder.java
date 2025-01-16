package Recursion;

public class LexicographicalOrder {
    public static void main(String[] args) {
        
    }
    public static void print(int n, int curr) {
        if(curr > n) return;
        System.out.println(curr);
        int i = 0; 
        if(curr == 0){
            i = 1;
        }
        for(; i<= 9; i++){
            print(n, curr*10 + i);
        }
    }
}
