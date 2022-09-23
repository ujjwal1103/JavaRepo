package javaassessment.problem3;

public class Admin extends ElectronicStore{


    protected Admin(String userName, String password) {
    }



    boolean isAdminLogIn = false;
    void adminLogIn(String userName,String password) {

        if(userName == "admin" && password == "1234"){
            isAdminLogIn = true;
            System.out.println("admin login successful");
        }
    }


    void adminLogout() {
        if(isAdminLogIn){
            System.out.println("admin logout successful");
        }
        else{
            System.out.println("please login first");
        }
    }

    protected void addNewProduct(String product){
        products.add(product);
    }

    void removeProduct(String product){
         products.remove(Integer.valueOf(product));
    }
    void addNewEmployee(Employee emp){
         employees.add(new Employee("ujjwal","1234"));
    }
    void removeEmployee(Employee emp){
        employees.remove(emp);
    }

    void viewProducts() {
         System.out.println(products);
    }
    void viewEmployee(int id) {
        System.out.println(employees.get(id));
    }

}
