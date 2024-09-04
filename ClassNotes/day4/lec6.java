package day4;

public class lec6 {
    
    public static int[] helloArray(){
        int[] arr = {1,2,3,++a};
        return arr;
    }
    public static int a = 9;
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(a);
        System.out.println(helloArray()[3]);
        System.out.println(a);
    } 
    
}
