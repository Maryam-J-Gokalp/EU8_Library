package day53_BuildInFunctionalIntefacesStream;

public class LambdaExpressions {

    public static void main(String[] args) {

        //Return())Return ReverseVersionOfString--> String reverse = new StringBuilder(s).reverse().toString(
        //Lambda expression--> }; u ShouldReturnAStringValueOtherWiseUGetCompilerError-->  return reverse;

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
                    String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };
         //Above function reverse the string

        //CallAbstract()Through interfaceReference UNeed 2 provide string argument CozISetStringOnMyInterfaceReference
        //Method return me a string I can Assign back to the string variable
        String result = stringReverse.method("Wooden Spoon");

        System.out.println(result);

        //create a function that can return the cube of an integer



    }

}