package Week1.day4;

import java.util.ArrayList;
import java.util.*;


public class UnmodifiableList {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        lst = Collections.unmodifiableList(lst);
        lst.add(7);
        lst.set(0,9);
        System.out.println(lst);
    }
}
