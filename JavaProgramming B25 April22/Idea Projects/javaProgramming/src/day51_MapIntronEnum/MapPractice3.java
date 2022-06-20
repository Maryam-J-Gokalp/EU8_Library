package day51_MapIntronEnum;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    //To Find Out All The Employee Who has the max Salary
    //1st step know is the max salary is
    //CompareEachEmployeesWhoHasThe maxSalary-->for (Map.Entry<String, Integer> pair : map.entrySet()) {
    // compareNameOfEmployeeGetMeTheSalary-->  if(pair.getValue() == maxSalary){
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        // displays the names of all employees who has the maximum salaries
        //ToFind out who has the max and the min salary apply the for Loop below
        //ApproachFindMaxSalaryYouFindTheMaxtInteger
/*
        int maxSalary = Integer.MIN_VALUE;
        for ( Integer eachValue : map.values() ) {
            if(eachValue > maxSalary){
                maxSalary = eachValue;
            }
        }
*/
        //One Loop Check who has the max salary
        int maxSalary = Collections.max( map.values() );

        System.out.println("maxSalary = " + maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxSalary){
                System.out.println(pair.getKey());
            }
        }

    }

}