package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); // visible
        System.out.println(AccessModifiers.publicData); // visible
        // System.out.println(AccessModifiers.privateData ); // private accessModifiers is not visible outside class
        // even if the class are in the same package, private is only visible

        /*
        to use in different package only public is accessible
         */
    }
}
