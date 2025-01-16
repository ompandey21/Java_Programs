package Functions;



public class VarArgs {
    static int sum(int...arr){
        int sum = 0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(2,4,3,5,6));        
    }
}
