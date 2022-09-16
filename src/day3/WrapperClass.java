package day3;

import org.w3c.dom.ls.LSOutput;

public class WrapperClass {
    /*Convert Primitive Type to Wrapper Objects (boxing/autoboxing)
    For the following:
    int a = 9;
    double d = 6.78;
    and check if they are converted to wrapper classes
    Sample output:
    An object of Integer is created.
    An object of Double is created.*/

    public static void main(String[] args) {
        int a = 9;
        Integer i = a; //Autoboxing
        if(i instanceof  Integer)
            System.out.println("An object of Integer is created.");

        double d = 6.78; //Autoboxing

        Double dd = d;
        if(dd instanceof Double)
             System.out.println("An object of Double is created.");
        int c = i; // Unboxing
        double t = dd; //unboxing
    }
}
