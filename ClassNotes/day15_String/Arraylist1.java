package day15_String;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(43);
        list.add(87);
        list.add(9);
        System.out.println(list);
        for (Integer a : list) {
            System.out.println(a);
        }
        Collections.sort(list);
        for (Integer a : list) {
            System.out.println(a);
        }
        
    }
}
