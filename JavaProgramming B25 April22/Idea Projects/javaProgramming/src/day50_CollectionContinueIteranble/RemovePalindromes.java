package day50_CollectionContinueIteranble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

         List<String> names = new ArrayList<>();
         names.addAll(
        Arrays.asList("Java","Python","Cydeo","Car","Level","civic","radar","kayak","reviver","racecar","madam")
        );

         //AlwaysApplyIterableForTheCollectionOtherWiseUMindGetBug.
        // SoToUseTheAboveElementINeedToAssignToAVariable&ReturnTypeIstString-->Iterator<String> it = names.iterator();
        //OnceICallHasNext()IfIWantToUseMoreThen1X INeedToRepeat&forThatINeedToUseALoop
        //HowUCallHasNext()4EachElement->while(it.hasNext()){.ToCallEachElementByUsingIt.Next()->String each=it.next();
        //ToVerifyIfStringIsPalindrome
        //VerifyIfStringIsPalindromeOrNotToReverseThe EachStringCreateAStringReverse--> String reverse = "";
        //INeedToApplyForLoopToIterateLastIndexOfEachStringUntilReachIndex0->for(int i= each.length()-1; i >=0;i--){

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            String reverse = "";   //<--ThisStringReverseVerifyIfIsPalindrome

            //ThisLoopIsHowUReverseAString
            for(int i = each.length()-1; i >= 0; i--){
                reverse += each.charAt(i);
            }
             //CrateIfConditionForRemovingTheElementFromTheIterator. CallRemove()fromTheIteratorCall->It.remove();
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }

        System.out.println(names);  //PrintName

        System.out.println("-----------------------------------------------------");
        //
        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        /*
        Predicate<String> palindrome = str -> {
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
            //AboveBlockStringIsHowUGiveLambdaExpressionIn4LinesAbove
        };
        names2.removeIf(palindrome);
         */

        /*
        //LambdaExpressionIn3LinesBelow
        names2.removeIf(str -> { String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);}
        );
        System.out.println(names2);
        */




    }


}