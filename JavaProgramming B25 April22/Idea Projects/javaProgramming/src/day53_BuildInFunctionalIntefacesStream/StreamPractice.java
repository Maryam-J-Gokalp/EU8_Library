package day53_BuildInFunctionalIntefacesStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
    //LIST 1 COMMENT
    //String is method&Perform a taskForUs
    //String()GetElementOfArrayList-->List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
    //IfIWantToRemoveDuplicateICallDistinct thenCallCollect()passIn( Collectors.toList());thenIs GoingToGive u theList
    //Then U Assign Back 2 Variable List -->list1 = list1.stream().distinct().collect( Collectors.toList());
    //IfUDon'tAssignBackListStill Reference as string-->System.out.println(list1);

    //ArrayUtilityClass callString()ApplyToArrayAfterUPass()2ArrayUtilityClass-->int[] arr1={1,1,2,2,3,3,4,4,5,5,6,6};
    //remove Duplicate Call Distinct() -->arr1 = Arrays.stream(arr1).distinct().toArray(); ......
    // to return Array From String Call To Array ()  and Assign Back to the array1 again
    //When pass into print statement give no duplicate version-->System.out.println(Arrays.toString(arr1));

public class StreamPractice {

    public static void main(String[] args) {
       //LIST 1
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));

        list1 = list1.stream().distinct().collect( Collectors.toList());

        System.out.println(list1);

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

      //LIST 2 EXAMPLE OF...

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2);

        int[] nums2 =  {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2));

        //LIST 3 EXAMPLE OF LIMIT ()

        //Return element(limit 7) as a list I need to call collect(Collectors.toList()); and return as a list..
        //ThenYouCanAssignIntoNew or sameList-->list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println(list3);

        // LIST 4 EXAMPLE OF MAP() USE TO MAKE CHANGE TO THE STRING
        //Example List4ContainElement--> List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));..
        //NextINeed toGetAllElementThatMultiplyBy10 1st I need to make modification to the string.To make modification
        //TheElementWithInTheString-stream(),INeed2CallMap() toChangeTheArgumentInTheString ToGiveFunctionInterface..
        //ArgumentAndReturnAValueGive the lambda expression (p->p*10)and what ever you want to return you can pass..
        // here ReturnTheNumber p * 10 so Lambda Expression Return & repeat Every Element of the string........
        // --> list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());
        //Call map() return the list and assign Back to the List 4 once u print u have multiply element ( p -> p * 10 )

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());

        System.out.println(list4);

        //ANOTHER EXAMPLE BELOW TO MODIFY YOU NEED TO CREATE A SUBSTRING TO EVERY SINGLE ELEMENT BLOCK BELOW

        //CanBeDoneUseMap() then INeedToProvide lambda expression for user interface-->map( p -> p.substring(0, 3) )...
        //INeedToReplaceStringToThe substring contain 3rd character name-->Monday to create a substring from index 0...
        //pass 3-->Symbolized 3rd character 0,3)) Once U Call Map() every string has SubStringStartFromIndex0 to Index2
        //Still In The String Call Collect () to use the Data instructure
        // Final result assign data 2 day-->days=days.stream().map(p ->p.substring(0,3)).collect(Collectors.toList());
        //Then print out-->System.out.println(days);

   List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));

        days =  days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());

        System.out.println(days);

       // LIST 5 EXAMPLE FILTER TO RETRIEVE ELEMENT THAT ARE VISIBLE BY 2

        //Then instore into the new list call evens number from the list I select ones that are even call string ()
        //To have all the element from the list, then I call filter()-->List<Integer> evens = list5.stream().filter
        //Then PassArgument filter interface&PassBooleanCondition-->.filter( p -> p%2==0).collect(Collectors.toList());
        //ConditionForEvenIf theNumberIsDivisible by 2-->( p -> p%2==0)thisStringHaveTheElementThat isFilterThenINeed..
        //To Collect2List--> List<Integer>evens = list5.stream().filter(p-> p%2==0).collect(Collectors.toList());
        //Then print even number--> System.out.println(evens);

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());
        System.out.println(evens);

        //EXAMPLE 6 FIND OUT HOW many Java HAVE IN THE LIST

         //CallString() filter2CreateACondition 4 java filter() get condition That Matching & Return Use Count()
        //then Cast into long -->long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();
        //Print -->System.out.println(countJava)
       //To IterateEveryStringElement use for each Give 1 () to ApplyLambda expression and to print every single element
        //Use p variable in the print statement--> System.out.println(p));
        //IterateStringElement>names.stream().filter(p ->p.equalsIgnoreCase("java")).forEach(p->System.out.println(p));

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();
        System.out.println(countJava);
        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));

        //LIST 7 EXAMPLE IS THE METHOD RETURN YOU BOOLEAN

        //AllMatch()Take theCondition&CheckIfMatch ifTheConditionMatch ReturnTrueOrFalse-->(1,2,30,4,5,6,7,8,9,10));..
        //ArgumentAll Match Accept is Predicate soINeedToGiveMyPredicateCondition
        //IFAllNumberAreEven-->List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));
        //ThereforeBooleanReturn--->boolean r1 = list6.stream().allMatch(p -> p%2==0);
        //if matchWithThePredicateReturnTrue otherWise returnFalse --> System.out.println(r1);

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));
        boolean r1 = list6.stream().allMatch(p -> p%2==0);
        System.out.println(r1);

        boolean r2 = list6.stream().anyMatch(p -> p>20);                        //verify if greater then 20
        System.out.println(r2);

        boolean r3 = list6.stream().noneMatch(p -> p%3==0);                     //VerifyListContainElementDivisibleBy3
        System.out.println(r3);


    }


}