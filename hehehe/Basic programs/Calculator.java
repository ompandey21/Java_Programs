
import java.util.*;
public class Calculator{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();
        
           
            switch(operator){
            case "+": System.out.println(a+b);
            break;
            case "-": System.out.println(a-b);
            break;
            case "*": System.out.println(a*b);
            break;
            case "/": if(b==0){
                System.out.println("invalid");
            } 
            else{ System.out.println(a/b);
            }
            break;
            case "%":if(b==0){
                System.out.println("invalid");
            }
                else{
                    System.out.println(a%b);
                }
            break;
           
        }
        sc.close();
       
        

    }
}