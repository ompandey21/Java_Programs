package Recursion;

public class BoardGame {
    
    public static void main(String[] args) {
        // no of calls  = no of faces of dice
        System.out.println(Print(4, 0, "")); 

    }
    public static int Print(int n, int curr, String ans) {
        if(curr == n){
            System.out.println(ans);
            return 1;
        }
        if(curr > n) return 0;
        int x = 0;
        for(int i = 1; i<n; i++) x+= Print(n, curr+i, ans+i);
        return x;
        
    }
}
