import java.util.Scanner;

  //input from user using Scanner Class
      import java.util.*;

        public class ScannerClass {
        public static void main( String[] args )
        {

            // Scanner definition
            Scanner scn= new Scanner(System.in);

            // input is a string
            // read by nextLine()function
            String str= scn.nextLine(); // String

            // print string
            System.out.println("Entered String : "+ str);

            // input is an Integer
            // read by nextInt() function
            int x= scn.nextInt(); //Scan function Integer:nextInt

            // print integer
            System.out.println("Entered Integer : "+ x);

            // input is a floatingValue
            // read by nextFloat() function
            float f = scn.nextFloat(); //ScannerFunction using Float:nextFloat

            // print floating value
            System.out.println("Entered FloatValue : "+ f);
        }
    }
   /*

    GFG
123
        123.090
    Output :

    Entered String : GFG
    Entered Integer : 123
    Entered FloatValue : 123.090
*/