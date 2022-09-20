package Week2.day5.LearnInheritance;

public class DriverCode {
    public static void main(String[] args) {
        Adder adder = new Adder();

        int sum1 = adder.add(20,22);
        int sum2 = adder.add(7,6);
        int sum3 = adder.add(10,10);
        System.out.print(sum1+" ");
        System.out.print(sum2+" ");
        System.out.print(sum3+"\n");
        adder.printSuperClassName();

    }

}
