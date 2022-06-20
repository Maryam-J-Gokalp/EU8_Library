package day52_MapContinueFunctionalInterface_LambdaIntro;

import java.util.*;
//ToUseLinkedHashMapIntoListCast2LinkedHashMap&Added->scrumTeams.add((LinkedHashMap<String.String>)scrumTeam1);
//ThenWeNeedToCast->scrumTeams.add((LinkedHasMap) scrumTeam1);//LinkedHashMap<Integer,Integer>m=new LinkedHashMap<>();

//Is Better to let the parent to be the reference type for us to be able to sort any map into the list
//DoesNotMatter whichTypeOf MAP U can reference into the map. SuchAs LinkedHashMap,HashMap,treeMap,hashtable
//ToSetEachElementTypeIntoTheMapList Create AsListOfMaps-->List< Map<String,String>>scrumTeams=new ArrayList<>();
//Now My map size is one-->List-->scrumTeams.add(  scrumTeam1);
//Then I can add my second scrum team 2 then the list size becomes two-->scrumTeams.add(scrumTeam2 );
//UseAddAll()2AddRemainingCharacter2TheTeam-->scrumTeams.addAll(Arrays.asList(scrumTeam3,scrumTeam4,scrumTeam5));

//The comment below isSay OnceUHaveTheList ContainTheMaps some couldBeLinkedHashMap SomeOfThemCouldBeDifferent
//And the LinkedHashMap automaticallyCastingInto theCollectionTypeSoIsBetterToKeepAs map not as LinkedHashMap
//   scrumTeams.addAll((Collection<? extends LinkedHashMap<String,String>>)Arrays.asList((LinkedHashMap)....
//   scrumTeam1,(LinkedHashMap) scrumTeam1,(LinkedHashMap) scrumTeam1));

public class ListOfMapPractice1 {

    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton","SDET");
        scrumTeam2.put("Muhammed","Developer");
        scrumTeam2.put("Gulistan","Developer");
        scrumTeam2.put("Ahmad","PO");
        scrumTeam2.put("Nevim","SM");
        scrumTeam2.put("Atakan","SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur","SDET");
        scrumTeam4.put("Farya","Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David","Sdet");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza","SDET");
        scrumTeam5.put("Mehmet","Developer");
        scrumTeam5.put("Stefan","Developer");
        scrumTeam5.put("Rishat","PO");
        scrumTeam5.put("Ismail","SM");
        scrumTeam5.put("Tamara","SDET");
        scrumTeam5.put("Adnan","QA");

        //  LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
        //    1.1 Create a data structure that can contain all the given maps above
        //To add map into a listAddThis map-->< Map<String, String> > //<--To support list object

        List< Map<String, String> >  scrumTeams = new ArrayList<>();
        scrumTeams.add(  scrumTeam1);
        scrumTeams.add(scrumTeam2 );
        scrumTeams.addAll(Arrays.asList(scrumTeam3, scrumTeam4, scrumTeam5));

        System.out.println(scrumTeams);
        System.out.println(scrumTeams.size());

        // Loop below print the names of all employees:
        //For Each Loop below To Iterate My List represent each object that I have in my list is Map KeyElementIsString
        ////IterateLisOfMap-->for(Map<String, String> eachScrumTeam  :  scrumTeams){
        //Use entrySet()2GetScrumTeamNameThenUse4Loop-->for(Map.Entry<String, String> entry:eachScrumTeam.entrySet()){
        //PrintUseEntry 2 getKey()ThenUseEntryGetValue()-->System.out.println(entry.getKey() +":"+entry.getValue());

        for(Map<String, String> eachScrumTeam  :  scrumTeams){
            for (Map.Entry<String, String> entry : eachScrumTeam.entrySet()) {
                System.out.println(entry.getKey() +" : "+entry.getValue());
            }
        }

        System.out.println("-------------------------------------------------------------");

        //  1.2 Print the names of all scrum masters

        for(Map<String, String> eachScrumTeam  :  scrumTeams) {

            /*
            Instead of iterate a map by the keys you can iterate by the pair
            for (String name : eachScrumTeam.keySet()) {
                if(eachScrumTeam.get(name).equals("SM") ){
                    System.out.println(name);
                }
            }
             */
            //IterateByPairCallEntrySet()TheForLoop2GetFunction
            //ThenGetTheValue-->    if (pair.getValue().equals("SM")) {
            //to get The employee from the pair call getKey to get employee name-->System.out.println(pair.getKey());
            for (Map.Entry<String, String> pair : eachScrumTeam.entrySet()) {
                if (pair.getValue().equals("SM")) {
                    System.out.println(pair.getKey());
                }
            }
        }

        System.out.println("-------------------------------------------------");

        //1.3 Print the names of all Developers use same method as above instead of use scrum master use scrum team

        for(Map<String, String> eachScrumTeam  :  scrumTeams) {

            /*
            for (String name : eachScrumTeam.keySet()) {
                if(eachScrumTeam.get(name).equals("SM") ){
                    System.out.println(name);
                }
            }
             */
            for (Map.Entry<String, String> pair : eachScrumTeam.entrySet()) {
                if (pair.getValue().equals("Developer")) {
                    System.out.println(pair.getKey());
                }
            }

        }





    }

}
/*
1.Given the following Maps:
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");
        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton","SDET");
        scrumTeam2.put("Muhammed","Developer");
        scrumTeam2.put("Gulistan","Developer");
        scrumTeam2.put("Ahmad","PO");
        scrumTeam2.put("Nevim","SM");
        scrumTeam2.put("Atakan","SDET");
        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");
        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur","SDET");
        scrumTeam4.put("Farya","Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David","Sdet");
        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza","SDET");
        scrumTeam5.put("Mehmet","Developer");
        scrumTeam5.put("Stefan","Developer");
        scrumTeam5.put("Rishat","PO");
        scrumTeam5.put("Ismail","SM");
        scrumTeam5.put("Tamara","SDET");
        scrumTeam5.put("Adnan","QA");
    1.1 Create a data structure that can contain all the given maps above
    1.2 Print the names of all scrum masters
    1.3 Print the names of all Developers
 */
