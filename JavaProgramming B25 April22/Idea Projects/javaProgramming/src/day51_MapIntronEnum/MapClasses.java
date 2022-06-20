package day51_MapIntronEnum;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //Whatever u specify in ur map isKey& keyNeverBeDuplicate and The value canBe-->KEY & the -->VALUE
        //DataType-->Integer Need to know the difference between the classes
        //I create Object From ArrayList SinceArrayList DoesNotSupportPrimitives
        //ArrayListCanNot Be ObjectTypeOfReference COZ ArrayCanNotAcceptString at TheBothEntry
        //Fpr Polymorphism Occur is a Relation is a must-->MapDoesNotHaveIsa Relation withCollection
        //When Create a class ObjectMustBe from Object Has Is A Relation with the map
        //IsARelation-->HashMap<>();-->LinkedHashMap<>();-->treeMap);-->hashtable);
        //One reference type can be reference to all of them only change class object name
        //One reference type can be reference to all of them only change class object name

        //One reference type can be reference to all of them only change class object name
     //WhenUStoreADataIntoThe map mustBeAn integer & string atTheSametime Map<Integer,String>hashMap=new HashMap<>();
        //How You use the map depends on the kind of integer you set
        //SeeObjectBelowIfYouUseSameObject moreThen 1TimeKey Value must be Unique and the value could be the same
        //IF you duplicate the key the last set of pair will be accepted hashmap the order is not guarantee
        //HASHMAP ORDER IS NOT GUARANTEE and to access the value you need to change the Key
        //    key     value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");

        System.out.println("hashMap = " + hashMap);

        // System.out.println(hashMap.get());

        //One reference type can be reference to all of them only change class object name
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);

        //One reference type can be reference to all of them only change class object name
        //To sort All data by ID TreeMapBestChoice & IfUAddNullToThe TreeMap you get NULLPoint of exception
        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7, null);

        //treeMap uCanNotStoreNullKey
        System.out.println("treeMap = " + treeMap);

        //One reference type can be reference to all of them only change class object name
        Map<Integer, String> hashtable = new Hashtable<>(); // key and value both can not null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        hashtable.put(6, null);

        System.out.println("hashtable = " + hashtable);


        //Foe anything does is null if you try to getAccess toThe Variable you get NULLPoint of exception
        //   String str = null;
        // System.out.println(str.toUpperCase());


    }

}

/*
browser   chrome
url
username   cydeo
password  cydeo123
 */
