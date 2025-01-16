package CodeForces;

import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int tests =0;
        System.out.println("Answer: \n");
        while(tests < t){
            String s = sc.next();
            int hr = Integer.parseInt(s.substring(0, 2));
            if(hr > 12){
                System.out.println(hr%12 + s.substring(2) + " PM");
            }else if(hr == 12){
                System.out.println(hr + s.substring(2) + " PM");
            }else{
                if(hr < 10){
                    System.out.println("0"+hr + s.substring(2) + " AM");
                }else
                System.out.println(hr + s.substring(2) + " AM");
            }
            }
            tests++;
        }
    }

