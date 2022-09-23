package javaassessment.problem1;

public class Head {
    String type;
    int price;

    public Head(String type, int price){
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'';
    }
}
