package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

    //ArrayList performance is moreFaster for accessing element & but UDon'tHaveAny Synchronized() InArrayList
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list1.get(0));

    //LinkedList Has fast performance for doing any accession or deleting
        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list2.get(0));

    //Vector use in java to be able to use tread safety to be able to apply to the method to be synchronized
        //Vector class has a method contain synchronized keyword, is that's why we say is synchronized
        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3.get(0));


        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list4.get(0));

        System.out.println("-------------------------------------------------------");

        System.out.println(list4);


        ((Stack) list4).pop(); //AfterDownCastingICanCallPoP the LatObjectWillOutFromTheStack

        System.out.println(list4); //OnceIPrintTheObject theSize willReduce byOne

        ((Stack) list4).pop();

        System.out.println(list4); //EveryTimeICallPop() Will keepReducing theSize


    }


    public synchronized void method1(){

    }



}