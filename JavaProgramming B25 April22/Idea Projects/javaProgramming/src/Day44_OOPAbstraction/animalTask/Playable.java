package Day44_OOPAbstraction.animalTask;

//to make sure that you create a variable that all the animal common similarity such as play() U need 2 create interface
//U can create interface similar to create a class when U right package name select INTERFACE instead of CLASS
//If I accidentally create as a class U can change CLASS keyword to INTERFACE on the first line of your class name
//IsBetter ToCreate InterfaceSubClass SoTheAnimals subClass canInherit OtherSubClass insteadFfCreate theSame() 21-By-1
//SuperType only create a variable and method that is going to use in subclass not focus on details
//I need to use public access modifier coz there is any restriction & is available for any class
//To create abstract() in abstract class I need to use abstract keyword then give method play
//Don't need to worry about the body coz this class is just abstract keyword B4 java8 abstractKeywordWere givenByDefault
//once u Add public access modifier U get grey color coz u dont need & abstract keyword
public interface Playable {

    boolean isFriendly = true; // static & final by default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    void play(); // abstract by default


}