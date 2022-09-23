package javaassessment.problem1;

public class Body {
    String type;
    int price;

    public Body(String type, int price) {

        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "type='" + type + '\'';
    }
}
