package javaassessment.problem1;

public class Movement {
    String type;
    int price;

    public Movement(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'';
    }


}
