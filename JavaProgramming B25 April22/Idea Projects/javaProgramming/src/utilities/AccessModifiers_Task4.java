package utilities;


import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Task4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
        // System.out.println(AccessModifiers_Task4.name1); // is not visible outside the package
        System.out.println(AccessModifiers_Task4.name2);//protected is visible outside the package in subclass only

        /*
        What are the differences between protected and default access specifiers in Java?
        The Protected access specifier is visible within the same package and also visible in the
        subclass whereas the Default is a package level access specifier and it can be visible in the same package

         */



    }
}
