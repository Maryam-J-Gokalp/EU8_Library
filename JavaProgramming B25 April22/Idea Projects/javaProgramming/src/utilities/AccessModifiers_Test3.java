package utilities;


import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test3 {
    public static void main(String[] args) {

        /*
        I cannot call variable name1 because the variable name1 is not visible outside the package
        or protected variable named2, I can call outside the package coz for subclass only
        this is not a subclass & protected is not visible
        Protected can only be visible if this class is a subclass otherwise in not visible
         */

      // System.out.println(ProtectedAccessModifier.named1);// default is not visible outside the package
      // System.out.println( ProtectedAccessModifier.named2);// protected is not always visible outside the package


    }
}
