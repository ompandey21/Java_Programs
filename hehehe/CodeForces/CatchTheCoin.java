package CodeForces;

import java.util.*;
public class CatchTheCoin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t; i++){
            int xCor = sc.nextInt();
            int yCor = sc.nextInt();
            int x = 0;
            int y = 0;
            int turn = 0;
            while(x != xCor){
                if(turn ==0){
                    if(x > xCor){
                    x--;
                }else{
                    x++;
                }
                y--;
                turn ++;
                }else{
                   yCor--;
                   turn--;
                }
                
                
                
                
            }
            if(y > yCor){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            
        }
    }
}                
                
                

