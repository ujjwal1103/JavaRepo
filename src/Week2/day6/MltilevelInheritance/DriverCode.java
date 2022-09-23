package Week2.day6.MltilevelInheritance;

public class DriverCode {
    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather();
        grandFather.swim();

        GrandFather father = new Father();
        father.swim();

        GrandFather son = new Son();
        son.swim();
    }
}
