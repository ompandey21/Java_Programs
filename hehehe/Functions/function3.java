public class function3 {
    public static int factorial(int n){
        int prod = 1;
        for(int i = n; i>=1; i--){
            prod = prod*i;
        }
        return prod;
    
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        
    }
}
