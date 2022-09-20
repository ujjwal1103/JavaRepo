package Week2.day5.DuckProblem;

public class DriverCode {
    public static void main(String[] args) {
        MallardDuck mDuck = new MallardDuck();
        mDuck.makeNoise();
        mDuck.swim();
        mDuck.walk();
        mDuck.fly();

        System.out.println("------------------");
        RubberDuck rDuck = new RubberDuck();
        rDuck.makeNoise();
        rDuck.squeez();

        System.out.println("------------------");
        WoodenDuck wDuck = new WoodenDuck();
        wDuck.decorate();
    }
}
