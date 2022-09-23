package javaassessment.problem1;
public class RobotDriver {



   public static void main(String[] args) {


        Head head = new Head("Standard Vision",2);
        Arms arms = new Arms("Hands", 2);
        Movement movement = new Movement("Legs",3);
        Power power = new Power("Solar",2);
        Body body = new Body("round",4);

        Robot robot = new Robot(head,body,movement);
        System.out.println(robot);

        System.out.println("price of robot "+robot.cost(robot) + " Lakh");
    }
}
