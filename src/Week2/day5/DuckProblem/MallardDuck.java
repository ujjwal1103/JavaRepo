package Week2.day5.DuckProblem;



public class MallardDuck implements Flyable,Swimable,Noise,Walkable{
    @Override
    public void makeNoise() {
        System.out.println("Can Make Noise");
    }

    @Override
    public void swim() {
        System.out.println("Duck can Swim");
    }

    @Override
    public void walk() {
        System.out.println("can walk");
    }

    @Override
    public void fly() {
        System.out.println("can Fly");
    }
}
