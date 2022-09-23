package javaassessment.problem1;



public class Robot <T>{
    Head head;
    Body body;
    Power power;
    Movement movement;
    Arms arms;
    public Robot(Head head, Body body, Power power, Movement movement, Arms arms) {
        this.head = head;
        this.body = body;
        this.power = power;
        this.movement = movement;
        this.arms = arms;
    }

    public Robot(Head head, Body body, Movement movement) {
        this.head = head;
        this.body = body;
        this.movement = movement;
        this.power = new Power("NA",0);
        this.arms = new Arms("NA",0);
    }

    public Robot(Head head, Body body, Power power) {
        this.head = head;
        this.body = body;
        this.movement = new Movement("NA",0);
        this.power = power;
        this.arms = new Arms("NA",0);
    }





    @Override
    public String toString() {
        return "Robot{" +
                "head:" + head +
                ", body:" + body +
                ", power:" + power +
                ", movement:" + movement +
                ", arms:" + arms +
                '}';
    }
    int cost(Robot robot){

        int cost = robot.arms.price+robot.body.price+robot.head.price+robot.movement.price+robot.power.price;
        return cost;
    }

    Robot purchase(Robot robot){
        return robot;
    }
}
