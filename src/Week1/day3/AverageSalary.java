package Week1.day3;

import java.util.Arrays;
import java.util.*;

public class AverageSalary {
    public static void main(String[] args) throws SalaryLengthException, NotUniqueSalaryElements {

        int[] salary = {1000, 2000, 1000};
        int salaryLength = salary.length;
        if(salaryLength  < 3 || salaryLength > 100){
            throw new SalaryLengthException("Length of Salary Array should be greater than 3 and less than 100");
        }

        Set<Integer> set = new HashSet<>();

        for(int i: salary){
            set.add(i);
        }
        System.out.println(set);
        if(set.size() != salaryLength){
            throw new NotUniqueSalaryElements("Integer of Salary should Unique");
        }
            Arrays.sort(salary);
            int[] newSalary =  Arrays.copyOfRange(salary,1,salary.length-1);
            int average = 0;
            for(int i:newSalary){
                average = average+i;
            }
            System.out.println(average/newSalary.length);



    }
}
