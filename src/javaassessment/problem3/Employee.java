package javaassessment.problem3;

public class Employee extends ElectronicStore{

    private String username;

    private String password;

    public Employee(String username, String password) {

        this.username = username;
        this.password = password;
    }


    void viewProducts() {
        System.out.println(products);
    }

    void shipProduct(String product){
        System.out.println("product is shipped successfully");
    }

    void updateQuantity(){
        System.out.println("Quantity updated");
    }

    void logOut(){
        System.out.println("Employee Logout");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                '}';
    }
}
