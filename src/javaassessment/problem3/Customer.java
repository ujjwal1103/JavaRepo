package javaassessment.problem3;

public class Customer extends ElectronicStore {
    int customerId;
    String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
    @Override
    void viewProducts() {
        super.viewProducts();
    }


    void searchProductByCustomer(String productForSearch) {
        if(super.searchProduct(productForSearch)){
            System.out.println("Product Found");
        }else{
            System.out.println(productForSearch + " is out of stock");
        }
    }


    void buyProduct(String product){
        if(this.searchProduct(product)){
            System.out.println("product is purchased");
        }else{
            System.out.println(product + " is out of stock");
        }
    }

    void logOut(){
        System.out.println("customer log out");

    }

}
