package Week2.day5.Student;

public class Student {
     private int studentAge;
    private String name;
    private int std;

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {

        return std;
    }

    public void setStd(int std) {
        if(this.studentAge == 10){

        this.std = std;
        }
        else{
            System.out.println("age should be 10");
        }


    }
}
