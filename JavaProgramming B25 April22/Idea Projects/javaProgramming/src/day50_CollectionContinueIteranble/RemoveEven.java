package day50_CollectionContinueIteranble;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100, 90, 80, 75, 45, 35, 25, 15));

        //Call The Element That Is Even Call--> set.removeIf( p -> p %2 ==0);<--passMyLambdaExpression

        //  set.removeIf( p -> p %2 ==0);

        //2ApplyIterableCallIterator&ReturnsUIntegerToReaUseAssignIntoAVariable->Iterator<Integer> it= set.iterator();
        //Use  The While Loop To Call The hasNext()--> while(it.hasNext()){
        //GetElementByUse->if(it.next() %2==0){. GetElementToVerifyIfElementCanBeVisibleBy0&UCanRemove->it.remove();
        //Use Iterator Block below orThis-->set.removeIf( p -> p %2 ==0); to Remove Object From The Collection
        //IfYouDon'tUseIterableItWillInternallyCauseABug
        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            if(it.next() %2 ==0){
                it.remove();
            }
        }

        System.out.println(set);


    }

}