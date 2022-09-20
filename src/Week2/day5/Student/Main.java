package Week2.day5.Student;


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        String name = sc.next();
        student.setName(name);
        int age = sc.nextInt();
        student.setStudentAge(age);
        int std = sc.nextInt();
        student.setStd(std);

        System.out.println(student.getName()+" "+student.getStd()+" "+student.getStudentAge());



//        System.out.println(student.getName()+" "+student.getStd()+" "+student.getStudentAge());

    }
}
