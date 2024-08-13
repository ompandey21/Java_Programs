import java.util.*;
public class exercise4 {
    public static double circumference(int rad){
        return rad*2*3.14;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(circumference(r));

        sc.close();
        
    }
}
