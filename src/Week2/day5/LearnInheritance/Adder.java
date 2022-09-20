package Week2.day5.LearnInheritance;

class Adder extends Arithmetic{
     void printSuperClassName(){
         System.out.println("My super class is: "+this.getClass().getSuperclass().getName());
     }
}
