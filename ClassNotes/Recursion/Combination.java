package Recursion;

public class Combination {
    public static void main(String[] args) {
        int n = 3;
        comb(n, "");
    }
    public static void comb(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length() == 0){
            comb(n-1, ans+"H");
            comb(n-1, ans+"T");
        }
        else if(ans.charAt(ans.length() -1) == 'H'){
            comb(n-1, ans+"T");
        }else{
            comb(n-1, ans+"H");
            comb(n-1, ans+"T");
        }
        
        


    }
}
