package day51_MapIntronEnum;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {
        //Iterate the map by keys and value You need to use ENTRYSET() To get each of the pair & also each value
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?
        //To Find Who has the maxim salary we should apply who has the min salary first
      //FromThe mapCallEntrySet()thenUseForLoopToIterateEachEntry->for (Map.Entry<String,Integer> pair:map.entrySet()){
        //getEachKey-->String eachKey = pair.getKey();
        //getEachValueOfTheMap-->Integer eachValue = pair.getValue();
      //ToGetEachSalaryIWouldSayEachValueIsGreaterThenICompareThisValue123000);WithCurrentMinSalary->Integer.MIN_VALUE;
        //IWouldCreateIfConditionIfTheSalaryIsGreaterThen-->if(eachValue > maxSalary){. Then replaceWith the salary
        //ThenAssignToTheStringVariableName eachKey-->  name1 = eachKey;
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;                              //ConditionWhoHasThe max salary
                name1 = eachKey;
            }
            //findMinSalary
           //EachValueCompareWithCurrentMinSalary-->if(eachValue < minSalary){
            //IfIsLessTheCurrentMinSalary--> minSalary = eachValue;
            //ThenTheValueAssignToTheMinSalaryNameOfThePersonAssignToTheVariableName-->name2 = eachKey;

            if(eachValue < minSalary){
                minSalary = eachValue;
                name2 = eachKey;
            }
        }
        //
        System.out.println(name1);
        System.out.println(name2);


        System.out.println("----------------------------------------------");

        //how many employees has the salary between 120k ~ 150K?
        //ToCountTheNumberOfEmployeeHasSalary-->120k-150K?.WeJustNeedToCheckNotCountStartFrom 0 --> int count = 0;
       //IterateTheMapUseValue&key(), theYouCanApplyForEachLoopToGetEachValue-->for (Integer eachValue: map.values()){
        //TheIWouldSayIfTheValueIs-->if(eachValue >= 120000 && eachValue <= 150000){
        //ThenYouCnIncreaseYheCount-->   count++;
        //PrintTheMapToDisPlayTheCountTheEmployeeHasSalaryBetween 120k ~ 150K?-->System.out.println(count);
        int count = 0;

        for (Integer eachValue : map.values()) {
            if(eachValue >= 120000 && eachValue <= 150000){
                count++;
            }
        }

        System.out.println(count);


        System.out.println("----------------------------------------------");

        //   1.4 display the names of the employees who are making less than 118k?
      //ToDisplayTheEmployeeNameUse entrySet()UseForEachLoop->for (Map.Entry<String, Integer> pair : map.entrySet()){
      //GetMapToIteratePairToGetValue&KeyAtTheSameTime IfTheSalaryIsLess than 118k?->  if( pair.getValue() < 118000){
        //ThenDisplayTheEmployeeName to getTheNameFromEachPairIGetTheKey--> System.out.println(pair.getKey());
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if( pair.getValue() < 118000){
                System.out.println(pair.getKey());
            }
        }

        System.out.println("----------------------------------------------");
        //Loop Below Iterate Each Value Increase by 10.000
        //ICanDoIterateTheKeys--"John&callReplacement() to get the value-->< 120000){
        //ToUseBothINeedPair--> if(entry.getValue() < 120000){. To checkWhichEmployeeGetLessThen120k
        //ThenYouSetThe salary to original salary plus 10.000.SoICanIterateTheMapByEntrySet
        //-->IncreaseBy10.000--> entry.setValue(entry.getValue()+10000);
        //OnceYouPrintSalaryIncreaseBy10.000-->  System.out.println(map);

        // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() < 120000){
                entry.setValue(entry.getValue()+10000);
            }
        }

        System.out.println(map);

    }


}

/*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */