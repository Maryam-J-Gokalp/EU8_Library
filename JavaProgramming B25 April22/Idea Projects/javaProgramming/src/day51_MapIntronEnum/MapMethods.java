package day51_MapIntronEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // student name & score:
        //Use HashMap if you want to access&process faster
        //PullAll() accepts one map & if u have a map that's ready u can add to the map
        //You Can increase the size of the map by calling put () & increase the size one by one-->Put()accepts
        //Provide 2 argument integer & string
        //decide key and value can be store into the map if u add Integer accept into(10,0,2)
        //to add Map<String, only accept String-->students.put("Aygun", 95);
        //    key     value
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);  //pair will accept the last pair

        System.out.println(students);
        System.out.println(students.size());


        // display the score of Alex:
        //use get() to find the size and get the value u must prove the key so my get()Below Key is get("Alex"));
        //The get()display the score of ALex
        //Replace() 90, the 1st argument Pass is key then -->students.replace("Ali",90 );replace with integer<--
        //Get() Provide key Alex -->new value 90-->students.replace("Ali", 90 );
        //Remove()give u integer I have toProvide both boolean and Value at the sameTime
        //key-->students.remove("Ozan"); and I have to provide name underscore 90-->students.replace("Ali", 90 );
        System.out.println(students.get("Alex"));

        // replace Ali' score to 90

        students.replace("Ali", 90 );

        System.out.println(students);

        students.remove("Alex");

        System.out.println(students);

        students.remove("Ozan");

        System.out.println(students);

        //map verify student isInTheMap or not-->boolean r1=students.containsKey("Muhtar");<--callContainKey()+name
        //Returns true is contains otherwise return you false

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);

        boolean r3 = students.containsValue(97);

        System.out.println(r3);

        System.out.println(students.isEmpty());

        System.out.println("-------------------------");
        //equals() compare object--> System.out.println(map1.equals(map2));
        //equals()--> System.out.println("map1 = " + map1);

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 ==  map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);



    }

}