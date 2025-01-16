package day16_Sliding_Window;

public class String_Advanced {
    public static void main(String[] args) {
        int k = 1;
        String s = "CodingBlocks";
        while(k <= s.length()){
            int i = 0;
            int j = k;
            while(j <= s.length()){
                System.out.print(s.substring(i, j)+" ");
                i++;
                j++;
            }
            System.out.println();
            k++;
        }

    }
    
}

