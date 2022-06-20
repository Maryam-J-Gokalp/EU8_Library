package day47_Polymorphism;

import Day44_OOPAbstraction.animalTask.Animal;
import Day44_OOPAbstraction.animalTask.Cat;
import Day44_OOPAbstraction.animalTask.Dog;
import day43_OOPAbstractionIntro.employeeTask.Employee;
import day43_OOPAbstractionIntro.employeeTask.Person;
import day43_OOPAbstractionIntro.employeeTask.Tester;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

    //Ex:If I have an object by default is circle & referenceType isToAssign the CircleToTheShape?
    //Polymorphism is possible COZ UPCasting is done implicit whenUAssign theChildObjectToTheParentClass
    //Called static polymorphism because the compiler statically binds the method call to a specific method.
    //If isNotDone explicit you cannot cast Circle 2 the Shape & Once Compiler know explicit castChild 2 Parent class
    //Shape shape = (Shape) new Circle(4); //upcasting
    //Java supports two kinds of polymorphism. You can overload a method with different sets of parameters.
        Shape shape2 = new Circle(5);

        //WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //Dog dog = (Dog)animal;// To assign one reference type to another ref you must downcasting SuperToSmallType
        //dog.bark();//ThisReferenceTypeICanNotCall uniqueDogObject COZ iDidNotPassAnimalRefType-->((Dog)animal).bark();
        //   Dog dog = (Dog)animal; // downcasting //UseTheReference more then 1X

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );
        //If U wantToCast bark()1x makeSure U complete B4 U Call() Uneed toGroup them in the parenthesis( (Dog)animal)
        //Once the task is complete U call() is call DOWNCASTING  (  (Dog)animal  ).bark();

        (  (Dog)animal  ).bark(); // use this downCasting 1x

        Shape shape1 = new Square(5);

        //If uGetErrorClick suggestionSolution select:CastQualifier to day45_Abstraction.shape.Square thenAutomaticCast
        // To access all the resources you need to apply DownCasting
        System.out.println( ((Square) shape1).getSide()  ); //Once you click on suggestSolution it AutomaticCastForYou

        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        // use more then once assign to a variable &do the casting
        // cat.meow();//to call () does not reference from the object type the only way is to through the DownCasting
        //to do that U can use shortCut through the intellij click on the red line B4()-> cat.meow();
        //on you Keyboard option & enter then will cast 4U--->( (Cat) animal2 ).meow();
        //Or click on the red icon select by default the 1st option CAST QUALIFIER TO DAY 44_Abstraction_animalTask.Cat
        //make sureTheCasting isGone B4 U CallThe() soMake sure u place within the parentheses-->((Cat)animal2).meow();

        ( (Cat) animal2 ).meow();

        // ( (Dog) animal2 ).bark();
        // U canCall the Bark() after casting the referenceType--> animal2 ) to the dog
        //Means the Cat can get the bark() from the Dog I dont getErrors but when u run your programme u get..
        //ClassCastException Create breakingPoint instead of cat is bark, EXCEPTION OCCUR WHEN IS NOT IS A RELATIONSHIP
        //So when cast cat type 2 Dog type & they do not have is a relation between them is that's why u get exception
        //WhenUCastAnimalType toTheOther mustHave is a relationship coz DogIsNotaCat & CatIsNotaDog&CatCanNotHaveADog()

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport();

        //  ( (Tester)employee ).unitTest();
        //when I cast UnitTest() There is a relation between Tester&Tester but I GetCompiler error when I call UnitTest
        //Why? Coz tester doesNotHave() unitTest() & U cannot call unitTestToReference type of Employee2TheTester

        //  ( (Developer)employee ).unitTest();
        //Developer haveUnitTest() whenUCast UGetClassCastException coz thereIs not relation between developer&Employee

        //ThereIsNotRelation BetweenTester&Driver EveryTimeWhenUCast ObjectType&ANewReferenceType hasNotRelation
        // UGetClassCastException Driver driver = (Driver) employee;  // line 1 cannotCast

        Person person = (Person) employee; // line 2 isUpCasting coz there isa Relation Coz testerCanBe a Person&Tester

        //    Teacher teacher = (Teacher) employee; // line 3 ..>there isa Relation Coz testerCanBe a Person&Tester
        //ObjectType&ANewReferenceType when U Run tell you Teacher&Employee hasNotRelation & UGetClassCastException

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();
        //WhenUCastVolume U getCompilerError, 1st COZ not everyData hasVolume so in CircleDoesNotHaveVolumeObject ...
        //IcanApplyCastingToCall() CastVolumeToCube after I cast-->((Cube)s1)then I callVolume-->((Cube)s1 ).volume();
        //To heck if objectType s1 hasIsARelation to (Cube) not CubeCannot ConvertToCircle & CircleCanNotConvert ToCube
        //WhenI run I get UGetClassCastException coz Circle & Cube it hasNotRelation &CastNeverBeDone
        //WhenU do DownCastingPayAttention to the NewReferenceType doesNotHave isARelation with the ObjectYouAreCasting..
        //TO U get UGetClassCastException & classCanNotBe Completed
        /*
        POLYMORPHISM U NEED TO KNOW
        When does Polymorphism occur?
        What are the rules?
        What is Instance Keyword for?
        What are the reference DownCasting for? & Why We need them?


         */
    }
}

