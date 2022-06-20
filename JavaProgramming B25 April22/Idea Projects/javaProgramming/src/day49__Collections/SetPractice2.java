package day49__Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};


        //FastWayIsToCreateAndObjetWePass to garbageCollectionAsSoonAsFinishUsing soICreate LinkedHashSet thenINeedTo..
        //ConvertMyArrayToTheCollectionTypeUseAsList()2ConvertIntoTheList&ThenINeedToUse toArray()ToConvertBackToArray
        //IPass0byDefault I mustAdd LinkedHashSet ToMakeAsOrder FirstAsFirst&LastAsLast

        arr = new LinkedHashSet<>( Arrays.asList(arr) ).toArray(new String[0]); //

        /*
       //IfIamNotWantToWorryAboutAnyOrder IShouldUseSet() TypeShouldBeString ToAddArrays IntoAsList()
       //ICanUse(Arrays.asList(arr)); coz EveryCollectionInAsList()AcceptCollectionType,ButArrayIsNotCollectionType
        //ButICanConvertIntoList by using this asList()--> Arrays.asList(arr));
        Set<String> set1 = new HashSet<>( Arrays.asList(arr));

       // ConvertSetToArrayINeedToPassStringArrayObject Below,IsRequireAsArgument
       //I Pass 0 To Let Compiler Know that I am trying to ConvertingInto String Array newArrayWillBeCreated
       //ToConvertBackIntoTheArray youCanCall toArray()&AssignBackInto my-->String[] arr =
        arr = set1.toArray(new String[0]);
        System.out.println(set1);
         */

        //ToPrintAboveArrayAnewArrayWillBePrintOut, and I canPrintTheArray byUsingToString()-->( Arrays.toString(arr));
        System.out.println( Arrays.toString(arr));

        //AnotherExampleOfArray below
        //UseHashSetToRemoverDuplicate fromTheList thenIConverted intoArrayListByUsingTheConstructor ArrayListIn Line44
       //Then,ICanAssignBackToTheListUsingTheLinkedHashSet<>(list)->list = new ArrayList<>( new LinkedHashSet<>(list))
        //ThenAddArrayListDirectlyIntoThe-->LinkedHashSet<>(list), ICanNotAddNewArrayListToBeTheReference HashSet
      //ToConvertIntoTheNewArrayListIMustUse newArrayListConstructor->list =new ArrayList<>(new LinkedHashSet<>(list))

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(  new LinkedHashSet<>(list)); //UseHashSetToRemoverDuplicate fromTheList

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> s =new ArrayList<>( Arrays.asList(array) );//<--AfterUCreateObjectIfIWant2AddElementICanUse addAll

        s.addAll(  Arrays.asList("E", "F", "G" )  );//ICanAddArrayIntoTheNewListAboveUsingAddAll()2AddMultipleElements

        System.out.println("-----------------------------------------------");
        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth elementBelow after removing the duplicates
                        Do not change the order of the elements
         */
        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        //ToReturn5thElementINeedToApplySet1st, &NotToEffectTheOrder IShouldUse LinkedHashSet<>, callConstructorToAdd
        //TheElementToConvertCollectionTypeINeedToUseThis asList()-->Arrays.asList(nums) )
     //theyNotHaveIsRelationToLetTheArray2ReferenceLinkedHashSetObject& ThereForeTheyCanNotReferenceToTheLinkedHashSet()
        //ConvertMyArrayToLinkedHashSetObjectUseAsList()2ConvertIntoTheList&ThenINeedToUse toArray()ToConvertBackToArray
        //WhenEverConvertCollectionTypeToTheArrayTheBestThingToDoIsToGive zero as returnType-->toArray(new Integer[0]);
       //DependsOnTheLengthOfThisCollectionType->Arrays.asList(nums),returnUTheArrayIfIsGreaterThen 0 ReturnsUTheLength
       //ifIsLessThen 0 ItCanNotChangeTheLength.UReferenceThis-->nums itWillReferenceNewObjectTheOldReferenceBeDissolve
        //This LinkedSetObject-->new LinkedHashSet<>(  Arrays.asList(nums) )<--WillBeCollectedByTheGarbageCollector-

        nums = new LinkedHashSet<>(  Arrays.asList(nums) ).toArray( new Integer[0] );//Call2Array()ToConvertBackToArray

        System.out.println(Arrays.toString(nums) );

        System.out.println("-----------------------------------------------");
        //AnotherSolutionBelowForSequenceOfCharacter. SequenceOfCharacterWillTakeTake1CollectionType&OneObjectReturnsU
        //TheFrequencyOfThatObjectThatOccurInThatCollection ToConvertThisString-->"eeeeeaaaabbbbccccdddeeeee"
        //<---TheICanGetTheFrequencyOfThisNumbers-->54434
        //  eabcd  //<--ToGetThisResultINeedToGetTheSameOrder-->eabcdabbbbccccdddeeeee"
      //ThereForeINeedToUse-->new LinkedHashSet&CreateAnArrayFromTheStringByUsingSplit()(Arrays.asList(str.split("")))){
        //SplitByEmptySpaceReturnUTheArrayThatContainEachCharactersOfTheString--->" eabcdabbbbccccdddeeeee";
        //ThisArrayOnlyReturnsCollectionTypeUseAsList() DoTheSameStepAsAbove
       String str = " eabcdabbbbccccdddeeeee"; //<-StringGivenToCheckHowManyXThisElement->eabcd OccurInCollectionType
        //  eabcd
        //  54434

        //UseForEachLoopToAccess LinkedHashSet ToGetEachElementThatIsNotDuplicate, ToFindOutHowMany X AppearsInTheString
        //UNeedToUseCollectionUtilityTakeCollectionType&OneObject&ReturnUTheeFrequencyOfThatObject
        //So(  Arrays.asList(str.split("")),each);<--EachIsMy2rdArgument&2rdCovertMyString-->" eabcdabbbbccccdddeeeee"..
        //ToArrayListToGetTheCollectionType-->result += each + Collections.frequency( Arrays.asList(str.split("")),each)
        //ApplyingTheSetBelowToFindTheFrequencyOfCharacters
      //LinkedHashSetGetStringCharacterOfString&RemoveDuplicateThenApply4EachLoop2FindOutHowManyTimesAppearsInTheString
      //CheckHowManyTimesEachAppearInTheString result += each + Collections.frequency Arrays.asList(str.split("")),each);
        //UseSplit() ToReturnStringArray andEachCharactersWillBetHEeLEMENTofThatArrayThenConvertToLostToPass1stArgument
        String result = ""; //FinalResultShouldHave-->e5a4b4c4d3<--ApplySetUseCollection()ToFigureOutSequence
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(  Arrays.asList(str.split("")) , each);
        }
        System.out.println(result); //PrintToSeeEachCharactersOfTheString

        System.out.println("----------------------------------------------------------");
        //MultipleNamesAddInTheSet &IfMultipleNameContainInTheDataInstructureICanNotUseSet
        //ToHaveSetLikeThis names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));
        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

      System.out.println(names.toArray(new String[0])[2]);//ReturnSpecificElementCall2Array()&IndexNumberPassStringArray
        System.out.println(new ArrayList<>(names).get(4));//OrConvertSet2ArrayListUseConstructorPassName.get(4)GetIndexN

        for(String each : names ){ //<--UseForEachLoopIsApplicableToAllDataInstructureToAccessAllTheElements
            System.out.println(each); //Use EACH toPrintEachNames fromTheSet
        }






    }

}