package day31_Constructors;

import day31_Constructors.day31_ScrumTask.Rectangle;

public class RectangleObjects {

    public static void main(String[] args) {

        /*
         to create an object from the rectangle class you need to.....
        // to use the new newKeyword then give constructor with two argument coz in rectangle class day 31
        // I do not have default constructor in class day 31, if I use default constructor i get compiler error
        // I have two give 2 parameters, 1st length then width of the rectangle
        // u can assign to a variable & object type need to be rectangle
        */
        Rectangle rectangle1 = new Rectangle(5.5, 3.5); // how you create a rectangle object

        Rectangle rectangle2 = new Rectangle(10.5, 8.5);

        System.out.println(rectangle1);
        System.out.println(rectangle2);


    }


}