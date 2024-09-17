package PracticeCodeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>(); 
        for(int i = 0; i<n; i++){
           
            int m = sc.nextInt();
                     
            for(int j = 0; j<m; j++){
                int x = sc.nextInt();
            
        }
        if(m%2 == 0){
            list.add("Alice");
        }else{
            list.add("Bob");
        }
       
    }
    for(String name: list){
        System.out.println(name);
    }
    sc.close();
}
}
