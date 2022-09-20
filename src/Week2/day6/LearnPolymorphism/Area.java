package Week2.day6.LearnPolymorphism;

public class Area {

    void findArea(double length,double breath){
        double area = length * breath;
        System.out.println("Area of rectangle is: "+area);
    }

    void findArea(double radius)
    {
        double area = 3.14 * radius * radius;
        System.out.println("area of circle is: "+area);
    }

    void findArea(double base1,double base2,double height){
        double areaOfTrapezium = ((base1+base2) / 2) * height;

        System.out.println("area of trapezium is: "+ areaOfTrapezium);
    }

}
