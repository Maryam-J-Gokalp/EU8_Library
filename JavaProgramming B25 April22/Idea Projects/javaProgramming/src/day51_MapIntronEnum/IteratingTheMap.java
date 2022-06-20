package day51_MapIntronEnum;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {
      //display name from the student
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);

        /*
        To use for each loop to get all the keys from the map
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
         //   System.out.println(eachKey +" : " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey) + 5);
        }
*/

        System.out.println(students);

        //Find out which student are eligible for early and angry bird
        //earlyBirdStudentScore >= 90 --> Map<String, Integer> earlyBirds = new HashMap<>();
        ////earlyBirdStudentScore < 90 --> Map<String, Integer> angryBirds = new HashMap<>();

        //Use for Each Loop below To Iterate the map to find if the student is early or angry bird
        //Iterate get keySeat--> for (String key : students.keySet()) {. Then apply for eachLoop2GetKey
        //Use get()toGetEachValueFromTheMap-->Integer value = students.get(key);
        //FindEachStudent eligible for early bird-->if(value >= 90){
        //AddName&ScoreOfStudent from mapCall put()+provideKey+value--> earlyBirds.put(key, value);
        //or else ToAddKey&Valur--> angryBirds.put(key, value);

        Map<String, Integer> earlyBirds = new HashMap<>();     // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>();     // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();

        //After U getThe aboveMethodU canAssign to the specific data use--> Set<String> names = students.keySet();

        System.out.println("--------------------------------------------------------");

        // Collection<Integer> scores = students.values();
        //Iterate the map below use the value
        //Convert collection type tp the list
        List<Integer> scores = new ArrayList<>( students.values() );

        System.out.println(scores);

        for (Integer value : students.values()) {             //get each value
            System.out.println(value);
        }

        System.out.println("--------------------------------------------------------");
        //if INTERVIEW ASK TO GET THE MAX & MIN using method of collection
        // The approach below how to find the max & min value from the map By using a loop
        // If u don't use method of collection

        int maxScore = Integer.MIN_VALUE;                     //min score
        int minScore = Integer.MAX_VALUE;                     //max score

        for (Integer score : students.values()) {             //max score
            if(score > maxScore){                             //to find the maxScore
                maxScore = score;
            }

            if(score < minScore){                               //get min score
                minScore =score;                                //assign min score
            }
        }
        System.out.println("maxScore = " + maxScore);           //see the minScore
        System.out.println("minScore = " + minScore);           //see the minScore

        System.out.println("--------------------------------------------------------");
        //INTERVIEW QUESTION KNOW THE TWO APPROACH
        //Another way to find the max and min number without Loop by using a map
        //Max() acceptCollectionType+PassAllTheValueFromThe()--> int max = Collections.max( students.values() );
        //Mim() acceptCollectionType+PassAllTheValueFromThe()-->int min = Collections.min( students.values() );

        int max = Collections.max( students.values() );
        int min = Collections.min( students.values() );

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------");
        //INTERVIEW QUESTION WRITE A PROGRAMME COUNT STUDENT HAS SCORE 95 OR GREATER
        // how many students has the score of 95 or greater

        int count = 0;

        for (Integer eachScore : students.values()) {
            if(eachScore >= 95){
                count++;
            }
        }
            /*
                    for (String eachKey : students.keySet()) {
                        Integer eachScore = students.get(eachKey);
                        if(eachScore >= 95){
                            count++;
                        }
                    }
            */
        System.out.println(count);

        System.out.println("--------------------------------------------------------");
        //Iterate the map by the keys and value both. need to Iterate by the entry
        //Apply for each loop to Iterate

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }

    }

}
