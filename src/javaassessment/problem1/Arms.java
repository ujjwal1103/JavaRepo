package javaassessment.problem1;

public class Arms {
    String type;
    int price;

    public Arms(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'';
    }
}
