package Week1.WeekOneAssignment;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
//import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("black");
        colors.add("white");

        System.out.println(colors);

        for(String color:colors){
            System.out.println(color);
        }

        colors.add(0,"pink");

        System.out.println(colors.get(4));

        colors.set(1,"orange");
        System.out.println("_________________________");
        System.out.println(colors);

        colors.remove(3);

        boolean isContain = colors.contains("blue");
        System.out.println(isContain);

        Collections.sort(colors);

        System.out.println(colors);

        ArrayList<String> colors2 = new ArrayList<>();
        colors2 = colors;
        System.out.println(colors2);

        Collections.shuffle(colors);

        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);

        var arr = colors.subList(2, 5);
        System.out.println(arr);

        boolean compare = colors.equals(colors2);
        System.out.println(compare);

        ArrayList<String> subColors = new ArrayList<>();
        subColors.add("violet");
        subColors.add("light green");
        subColors.add("gray");

        System.out.println(subColors);

        colors.addAll(subColors);

        System.out.println(colors);

        Collections.swap(colors,0,3);

        System.out.println(colors);
        colors = (ArrayList<String>) subColors.clone();

        System.out.println(colors);

        colors.removeAll(colors);
        System.out.println(colors);

        boolean isEmpty = colors.isEmpty();

        System.out.println(subColors);

        subColors.trimToSize();
        System.out.println(subColors);

        subColors.ensureCapacity(20);







    }
}
