package javaassessment.problem1;

public class Power {
    String type;
    int price;

    public Power(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'';
    }
}
