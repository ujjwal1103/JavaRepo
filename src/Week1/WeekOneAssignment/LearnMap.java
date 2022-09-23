package Week1.WeekOneAssignment;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");

        map.put(2,"three");

       for(Map.Entry<Integer,String> e:map.entrySet()){
           System.out.println(e.getValue());
       }
    }
}
