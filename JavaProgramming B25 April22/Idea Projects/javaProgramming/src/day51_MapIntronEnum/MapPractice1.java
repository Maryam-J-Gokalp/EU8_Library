package day51_MapIntronEnum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    //Usually when Start a class u have a map and get the data names from the database
    //Then you store into the map, all data are stored next you need to test the data by Iterate the map
    //
    public static void main(String[] args) {
        //Below isOurGiven map,Once Created then we need to test the map value and pass into data
        //And next we need to Update the character For Male & Female to change the value u use another key
        //And Replace method
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female
        //To Iterate Use keySet() use for each loop to Iterate the map below
        /*
        All the characters on the block below are replace by male and female to alterate all the keys
                for (String key : employeeMap.keySet()) {
                    if(employeeMap.get(key).equalsIgnoreCase("m") ){
                        employeeMap.replace(key, "Male");
                    }
                    if(employeeMap.get(key).equalsIgnoreCase("f")){
                        employeeMap.replace(key, "Female");
                    }
                }
        */

        //entrySet() below to Iterate Each pair to get each value use the getter
        //To setValue to male--> if(entry.getValue().equalsIgnoreCase("m") ){
        //Each -->Entry get Key & value
        //Is better to stay with ENTRYSET() COZ Can Iterate all keySet() & Values()

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("m")) {
                entry.setValue("Male");
                //    employeeMap.replace(entry.getKey() , "Male");

            }
            //Do the same with the female just change male to female
            if (entry.getValue().equalsIgnoreCase("f")) {
                entry.setValue("Female");
                //    employeeMap.replace(entry.getKey() , "Female");
            }
        }

        System.out.println(employeeMap);

        System.out.println("--------------------------------------");

        //  2. Display the names of all female employees
        //Is better to stay with ENTRYSET() COZ Can Iterate all keySet() & Values()
        //To display all employees use for each loop to Iterate each entry
       //ToGetEachPairIterateTheMapUseThis entrySet()->for(Map.Entry<String,String> eachPair:employeeMap.entrySet()){
        //GetEachFromThePairCall-->getKeyMethod-->String eachKey = eachPair.getKey();
        //GetEach key from the pai-->

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachKey = eachPair.getKey();
            String eachValue = eachPair.getValue();

            if (eachValue.equals("Female")) {
                System.out.println(eachKey);
            }

        }

    }
}

