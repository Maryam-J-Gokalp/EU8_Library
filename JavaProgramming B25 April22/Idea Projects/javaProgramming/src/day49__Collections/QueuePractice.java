package day49__Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90)); //1stAdd (10, 200, 300, 40, 90))IntoThe PriorityQueue

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90)); //2rd AddSameElementIntoTheArrayDeque(10,200, 00,40,90))

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));//3rd AddSameElementIntoLinkedList(10,200, 00,40,90))

        System.out.println("linkedList = " + linkedList);
        //OnceYouPrintOutOnlyThePriorityQueue DoNotGiveTheSearchOrder Only the ArrayDeque<>();&LinkedList<>();
        System.out.println("-------------------------------------------------");
        //RegardlessWhatQueue ItIsTheyAllHaveFirstIn&FirstOutOrder
        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue); //EveryTimeYouCallThe()1stNumberWillBeOut

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque); //EveryTimeYouCallThe()1stNumberWillBeOut

        linkedList.poll();

        System.out.println("linkedList = " + linkedList); //UCanAlsoCall()FromLinkedList1stNumberWillBeOut

        System.out.println("-------------------------------------------------");

        // System.out.println(priorityQueue.get(1));
        //  System.out.println(arrayDeque.get(1));

        //   System.out.println( ( (List)linkedList ).get(1) );

        System.out.println(((LinkedList<Integer>) linkedList).get(1)); //<-CallGet1st()INeedToDownCastToTheLinkedList
        //ICanAlsoCastToTheListCozItHasARelationshipOfItOwnObject.

      //UseMore:LIST&SET StayWayFromQueue
    }

}
