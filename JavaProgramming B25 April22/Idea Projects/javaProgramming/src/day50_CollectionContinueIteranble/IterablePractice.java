package day50_CollectionContinueIteranble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4
        //CanNotRemoveAllElementThatIsLessThen4COZCollectionTypeAreDynamicDifferentElementReplaceIndexNumber
        //SomeElementMaybeSkipIsThat'sWhyIterableIsIntroducedToFixTheComplexity
        //IterableCheckAllElementThatIsNeededForRemoving&WhichEverElementIsMatchingWillBeRemoveAtTheSameTime
        //IterableJustWorriesAboutTheIndexNumber
        //2RemoveAllElement1stInnedToUseALoopToIterateAllTheListElements
        //UseFirst (I)IGetEachElementFromTheList & UseThe2rd (i)ICanIterateEachElementFromTheList
        //ToGetEachElementFromTheListApplyGet()thenIPassTheIndexNumberFromTheList-->if(list.get(i) < 4){
        //RemoveElementDoesNotAcceptIndexNumberSoICallRemove()&ICanPassIndexNumber(i)&ThatIndexWillBeRemove

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);   //RemoveIndex
            }
        }

        System.out.println(list);

        System.out.println("===================================================");
        //RemoveElementFromAnyCollectionTypeMustNeedIterableOtherWiseTheElementWillNotBeRemoveProperlyDuringIteration
        //2RemoveIterableYouNeedTheIterator1st
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4
        //<--OnceUCallThisIterationUGainTheInterfaceCallIterator. ToUseAllElementFromTheListUCanAssign
        //BackToTheVariableThatIsMatchingWithTheReturnTypeOfThisIteratorIsListReturnsMeIteratorInterface
       // With->iterator(); >--i OfInteger SoThereforeICanAssignToTheVariableIterator<Integer> it = list2.iterator();

        //TheFirstBlockCodeBelowIsShowingUHowUApplyIterable
        Iterator<Integer> it = list2.iterator();

        /*
        boolean r1 = it.hasNext();//get1stElementFromTheList->hasNext();returnsUBooleanOnlyGetHasNext()ElementIfIsTrue
        System.out.println(r1); //IfReturnsYouTrue
        System.out.println(it.next()); //ThenYouCanUseHasNex()ToGetTheFirstElement&ThenMoveToTheNestElement
        boolean r2 = it.hasNext();
        System.out.println(r2);
        System.out.println(it.next());
    */

        //ManualRemoveIteratorBelow or RemoveIf()BelowUseForeachLoop

        while(it.hasNext()){         //get1stElement withThe IterableToGetAllTheElement
            if( it.next()  < 4 ){     //>--ThisIsHowURemoveElementThatIsLessThen4 withoutThe Iterable
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("===================================================");
        //ConvertWhileLoopWithTheForLoopBelow
        //1stUNeedToGiveTheInitializationThenGiveACondition InitializationCallTheIterator()FromTheList3
        //TheIteratorReturnsMeTheIteratorPiInTheEnd ConditionINeedToGiveInCondition3
        //for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){
        //TheCreateAConditionIfTheElementIs<4-->if(i.next() < 4 ){ //TheRe,mreElementFromIterator

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){
            if(i.next() < 4 ){   //<--ConditionIf<4,ElementRemoveFromIterator
                i.remove();   //<--CallRemoveElement()FromIteratorVariable
            }
        }

        System.out.println(list3);

        System.out.println("===================================================");
        //list4.removeIf( each ->  each < 4 );  //RemoveAllElement<4 FirstGiveaVariableRepresentEachElementOfTheString
        //Then( each ->  each < 4 ); //<--PassTheConditionEach<4ToRemoveTheElement. AsSoonUProvideConditionForRemoving
        //IteratorForRemoveIf()CallRemoveIf()FromTheIteratorUnderThisCondition-->(i.next() < 4 ){

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each ->  each < 4 );  //RemoveAllElement<4Condition

        System.out.println(list4);



    }

}
