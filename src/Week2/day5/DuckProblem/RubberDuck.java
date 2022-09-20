package Week2.day5.DuckProblem;

public class RubberDuck implements Noise,Squeezable{
    @Override
    public void makeNoise() {
        System.out.println("can make noise");
    }

    @Override
    public void squeez() {
        System.out.println("can squeez");
    }
}
