package Week2.day7.valueObject;

public class EuroDriver {
    public static void main(String[] args) {
        Euro euro = new Euro(10);
        Euro euro2 = new Euro(10);
        Euro euro3 = new Euro(20);
        System.out.println(euro.equals(euro2));
        System.out.println(euro.add(euro2).money);
        System.out.println(euro2.add(euro3).money);
    }
}
