import java.util.Scanner;
//* Total length of a string 
public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
        }
        sc.close();
        int totalLength = 0;
        for(int i = 0; i<n; i++){
            totalLength = totalLength + arr[i].length();
        }
        System.out.println(totalLength);
    }
}