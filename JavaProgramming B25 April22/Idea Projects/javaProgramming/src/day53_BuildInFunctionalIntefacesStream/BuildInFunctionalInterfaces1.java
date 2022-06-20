package day53_BuildInFunctionalIntefacesStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
//ToWrite Lambda expression BuildInFunctional Interfaces 1st you Need ToWrite -->() -> {}; If You Get compiler error
//LambdaExpressionDependsOnFunctional interfaceUHaveIUsePredicateIPass p -->Predicate<String> isPalindrome = (p) -> {
//VerifyIfIsPalindromeApplyStringRevers&returnToString()-->String reverse=new StringBuilder(p).reverse().toString();
//CompilerErrorMustReturnBooleanValueInTheEndIUseReverseString=2MyArgument->(p)-->return reverse.equalsIgnoreCase(p);
//toVerifyO=IfIsPalindromeICallAbstract()->Test & passString->(java)-->boolean result1 = isPalindrome.test("Java");
//PrintResult--> System.out.println(result1);
//UsePredicate2FindIsIntegerPass->p ArgumentCondition-> p % 2 even==0;-->Predicate<Integer> isEven = p -> p % 2 == 0;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);

        Predicate<Integer> isEven = p -> p % 2 == 0;

      //Above function returns youBoolean & foAny function uWant2cCreate uCan always use Predicate

        System.out.println("--------------------------------------");
        //OnceUCallPredicateIsGoingToAccept IntegerAsReturnType-->(isEven) ifUDon'tHaveApplyLambdaExpression....
        //If you don't have more than one statement the {} is not necessary--> list.removeIf(p -> {  p%2==0;} );
        //ReturnAllEvenNumberUse removeIf()PassPredicateConditionPassLambdaE
        //anyFunctionTakeOneValur&Returns BooleanAlways use predicate expression->list.removeIf(p-> p % 2 == 0);
        //whenPrint all even number are left-->System.out.println(list);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));
        list.removeIf(p -> p % 2 == 0);
        System.out.println(list);

        System.out.println("------------------------------------------");
        //CallRemoveIf() to removePalindromeFrom TheString or ProvidePredicate--> names.removeIf(isPalindrome);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);
        System.out.println(names);

        System.out.println("----------------------------------------");
   //CreateFunction2PrintEveryStringCharacterUseConsumerTake1TypeNotReturnValue-->Consumer<String> printEach = (s)->{
        //Apply For Each Loop to print character in separate line--> for (int i = 0; i < s.length(); i++) {
        //I need to get each character by using(i) --->  System.out.println(s.charAt(i));
        //NowCall abstract() through the Interface we declare to print string character--> printEach.accept("Java");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Java");

        System.out.println("---------------------------------------------");
        //EveryTime when you call forEach() it has the same function of the for each loop with short version
        //--> if (p % 2 != 0) System.out.println(p);
        //-->});

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

        /*
        //PrintSingle oddNumberUseForEachLoop the way below
        for (Integer each : list2) {
            if(each % 2 != 0){
                System.out.println(each);
            }
        }
    */
     /*
       AlsoTheBelowVersionAreBetter&ShortThen forEachLoop FromTheListCA=allForEach() it take the consumer..
        4interfaceToGiveTheArgument  Lambda expressionOfConsumer interface&PassInteger--> list2.forEach(p -> {
        then print the value with one method below, & if u have a condition u could say if number is divided by 2
        then I can print  the element the loop below is same version of the above loop that I commented

         list2.forEach( p -> System.out.println(p));
             if (p % 2 != 0) System.out.println(p);
        });

         */

        list2.forEach(p -> {
            if (p % 2 != 0) System.out.println(p);
        });

        System.out.println("-------------------------------------------");
        //Complete the () below by using for each method u need to write lambda expression for the consumer interface
        //LambdaExpression->employees.forEach(s ->System.out.println(s.charAt(0)+"."+ s.charAt(s.lastIndexOf("")+1)));

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("-------------------------------------------");


        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);


        System.out.println("-------------------------------------------");
        //Convert list of Integer into the Array use T as Integer & R as array therefore t I set to List
        //R ConvertToArray & writeLambdaExpression-->(a)->{-->Function<List<Integer>, int[]> convertToArray = (a)->{
        //ReturnArrayListElement Int & SetTheSizeTo1 ofGivenList[a.size()]; --> int[] result = new int[a.size()];
        //Array list size is fix u can not do add or remove is that why u need to set the size first
        //I need one loop to iterate both from index 0 to last index -->for (int i = 0; i < a.size(); i++) {
        //--> result[i] = a.get(i);
        //Next all we need is to return the array --> return result;

        //Example this list contain the elements-->List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //To execute the above commented implementation through the function interface convertToArray I call abstract()
        //it's ask me to return List of integer and assign into int-->int[] result2 = convertToArray.apply(numbers);

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }

            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] result2 = convertToArray.apply(numbers);

        System.out.println("-------------------------------------------");

        // create a function that can return the maximum number from an int array

        // create a function that can swap the first and last elements of an array

        // Create a function that can reverse an array and returns it

        // create a function that can reverse a List



    }

}