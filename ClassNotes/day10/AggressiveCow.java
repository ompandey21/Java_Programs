package day10;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []stall= {1,2,8,4,9};
		int noc =3;
		Arrays.sort(stall);
		System.out.println(Large_min(stall,noc));

	}
	public static int Large_min(int[]stall,int noc) {
		int l=0;
		int h=stall[stall.length-1]-stall[0];
		int ans=0;
		while(l<=h) {
			int mid=((l+h)/2);
			if(isitpossible(stall,noc,mid)) {
				ans=mid;
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}  
        return l;
	}
	public static boolean isitpossible(int []stall,int noc,int mid) {
        int pos = stall[0];
        int cow = 1;
        for(int i = 0; i<stall.length;i++){
            if(stall[i] - pos >= mid){
                cow++;
                pos = stall[i];
            }
        }
		
		return false;
	}

}
