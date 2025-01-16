package day10;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++){
			int n = sc.nextInt();
			int nos = sc.nextInt();
			int[] page = new int[n];
			for(int l = 0; l<n; l++){
				page[i] = sc.nextInt();
			}
			System.out.println(MinimumPage(page, nos));
		}

    }
    public static int MinimumPage(int[] page, int nos){
        int low = 0;
        int high = 0;
        int ans = 0;
        for(int i= 0 ; i<page.length; i++){
            high+= page[i];

        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isitpossible(page, nos, mid) == true){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] page, int nos, int mid) {
            int student = 1;
            int readpage = 0;
            int x = 0 ;
            while(x < page.length){
                
                if(readpage + page[x]> mid){
                    readpage = 0;
                    student ++;
                }else{
                    readpage += page[x];
                    x++;
                }
                if(student > nos){
                    return false;
                }
                
            }
            return true;

        }
        
    }

