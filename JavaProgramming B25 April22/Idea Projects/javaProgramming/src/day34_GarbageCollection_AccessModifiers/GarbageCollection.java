package day34_GarbageCollection_AccessModifiers;

import Day30_CustomClass_Intro.day30_CustomClass.Dog;
import Day33_CustomClass_Statics.day33_Statics.Iphone;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;


public class GarbageCollection {

    public static void main(String[] args) {
        /*
        //  int n = null;
       String str = null;
        System.out.println( str.toUpperCase() );//>--if u put null to null primitive data type u will get nullPointException on the console]
        // because you are trying to access to the instances, in order to use instance you must have an objects
       // u can use null keyword if u want the object to destroy in jva heap memory
       When u print u get null coz one variable reference to one data
       null keyword means not object is create
       2rd way of unreferenced object ic by create a new object
         */

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection when u assign a null keyword
        str = null; // Vc PODE USAR null para null primitive data type..when u use null means object don't exist

        System.out.println( str );
        // pick class create 1 constructor, easy to create object
        Car car1 = new Car("Toyota"); // custom class, 2 make eligible 4 garbage collection 1st away 2 assign null
        car1 = null;
        System.out.println("car1");

        System.out.println("--------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1  =     new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
        language    =   "Java";

        System.out.println(language);

        System.out.println("-----------------------------------");
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );

        System.out.println("-----------------------------------");

        Student student1 = new Student( "Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);







    }


}