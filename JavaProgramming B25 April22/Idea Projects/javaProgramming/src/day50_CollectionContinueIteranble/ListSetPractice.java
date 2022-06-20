package day50_CollectionContinueIteranble;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        //Integer[]array set.toArray(new Integer[0]);//<-ConvertSetToArray()<-ReturnIntegerArrayAssignArrayOfInteger
        //IfIPassTheSetElementOfCollectionGetTheWholeElementOfSet&PassToTheArrayListCollection-->ArrayList()-->◊
        //NowIHaveTheListOfIntegerCOZObjectIsInteger--> List<Integer> list =new ArrayList<>( set );
         //IfTheSetDoesNotHaveIndexNumberYouCanConvertIntoAnotherTypeToAccess
        List<Integer> list =new ArrayList<>( set );

        System.out.println(list);

       //Null PointExceptionOccur
        // WhenEverUHaveANullThat'sAssignToAnyReference&That'sIsWhenYouGet-->NullPointExceptionOccur
        //  List<String> names = null;
        // System.out.println(names.size());

        System.out.println("----------------------------------------");

        // pop() ==> LIFO (POP()<--UseOnlyFor StackObject
        //4CharacterAddedToTheList-->('A', 'B', 'C', 'D')); ObjectCreateFromTheSet
        //2CastPOPUseCastOperator-->(chars )&UUseTheSetType-->StackUAreCastingTo-->(  (Stack)chars ).pop();
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); //[A, B, C, D]

        (  (Stack)chars ).pop();  //<--2CallPop()CastReferenceTypeCharsToTheSet&TypeUCasting2..>Stack

        System.out.println("chars = " + chars); //[A, B, C] <--AfterPrintTheListTheLastPopObjectIsOut

        //ToCall-->Poll(),INeedObjectOfPriorityQueue or ArrayDequeue or LinkedList
        //poll() ==> FIFO

        //IfIsArrayListObjectIStillGetTheSamerResult & UGetClassOutExceptionIfUCastOneObjectTypeIntoAnotherType
        //IfThereIsIs a relation ObjectArrayListCastingToStack Arraylist&StackThereIsNotRelationSoNoCastOccur
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names);

        ((LinkedList<String>) names).poll(); //<--ToCastPoll()IntellijProvideYouTheShortCut 4U2PassLinkedList<>();

        System.out.println(names);  //AfterCallPoll()EveryTimeWhenUCallThe1stElementRemoveFromList

        ((LinkedList<String>) names).poll();

        System.out.println(names);







    }


}