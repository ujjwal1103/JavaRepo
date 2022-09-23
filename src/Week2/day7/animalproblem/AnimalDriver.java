package Week2.day7.animalproblem;
public class AnimalDriver {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        Animal carnivores = new Carnivores();
        carnivores.eat();
        Animal herbivores = new Herbivores();
        herbivores.eat();
        Animal omnivores = new Omnivores();
        omnivores.eat();
    }
}
