package javaassessment.problem3;
import java.util.*;
public class StoreDriver  {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Choose who you are from following");
        System.out.println("1. Admin");
        System.out.println("2. Employee");
        System.out.println("3. Customer");

        int n = sc.nextInt();

        if(n == 1){
            Admin admin = new Admin("admin","1234");

                System.out.println("what you wants to perform");
                System.out.println("1. Add new Product");
                System.out.println("2. remove product");
                System.out.println("3. add new Employee");
                System.out.println("4. view Product");
                System.out.println("5. view Employee");
                System.out.println("6. remove Employee");
                System.out.println("7. logout");

                int num = sc.nextInt();

                if(num == 1){
                    sc.nextLine();
                    System.out.println("Enter name of Product");
                    String productName = sc.nextLine();
                    admin.addNewProduct(productName);
                    System.out.println("product added successFully");
                }
                if(num == 2){
                    String productName = sc.nextLine();
                    admin.removeProduct(productName);

                    System.out.println("product added sucessFully");
                }
                if(num == 3){
                    System.out.println("Enter Employee Name");

                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter Employee password");
                    String password = sc.nextLine();
                    if(password == "" && name == ""){
                        System.out.println("please add username and password");
                    }
                    else{
                        Employee emp = new Employee(name,password);
                        admin.addNewEmployee(emp);
                        System.out.println("Employee Added Successfully");
                    }
                }
                if(num == 4){
                    admin.viewProducts();
                }
                if(num == 5){
                    System.out.println("Enter Employee id");
                    int id = sc.nextInt();
                    admin.viewEmployee(id);
                }
        }
        else if(n == 2){

            Employee emp1 = new Employee("sager","1234");
            emp1.viewProducts();
        }
        else if(n == 3){
            Customer customer = new Customer(1,"raj");
            customer.viewProducts();
            customer.buyProduct("Tv");
            customer.searchProductByCustomer("Tv");
            customer.logOut();
        }else{
            System.out.println("please choose valid number from 1 to 3");
        }









    }


}
