package javaassessment.problem3;

import java.util.ArrayList;

public class ElectronicStore {
      public ArrayList<String> products = new ArrayList<>();
      protected ArrayList<Employee> employees = new ArrayList<>();

      protected ArrayList<String> customers = new ArrayList<String>();

      void viewProducts(){
         System.out.println(products);
      }

      boolean searchProduct(String productForSearch){
            for(String product:products){
                  if(product.equals(productForSearch)){
                       return true;
                  }
            }
            return false;
      }








}
