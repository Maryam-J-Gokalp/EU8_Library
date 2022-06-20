package day49__Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        //IUseArrayList to removeDuplicateObject so I letTheSetToBeTheReferenceOfTheObjectThatICreateFromArrayList
        //SoArrayListCanAccessAnyElementToRemoveDuplicates&ItHasIndexNumber. SoTheOnlyTimeTheReferenceCanBe
        //DifferentFromTheObjectIsWhenYouApplyPolymorphism That's isWhenTheReferenceCanBeDifferentFromTheObjectType
        //InOrderForPolymorphismCouldHappenInheritanceIsAMust
        //AThereIsNotRelationshipBetweenArrayList&TheSet ButTheArrayListImplementTheList&ItAnotherChildOfTheCollection
        //IfSet&ArraylistThereIsNotRelationShip bothOfThemCanNotBeReferenceTypeCozThereIsNotRelationShip
        //WhenUseTheSetReferenceTheIsOnlyThreeClassThatCreate: HashSet<>();-->LinkedHashSet<>();--> treeSet);
        //EvenIfIAddAllTheElementOnMyFirstListBelow, but OnceIPrintIOnlyGet5Elements &OnMyHashSet IHave25Elements....
        //TheRemaining20ElementsWereRemoveCOZThey WereDuplicate&SetNotAcceptDuplicateElements

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("list = " + list);
        System.out.println( list.get(4) ); //<--ThisList I Use get(4)<--ProvideNumber4 toGetThe5thElementFromTheList

        //ToConcernPerformance& UseSet ToRemoveDuplicateElements and KeepTheUniqueElementThatIsNotDuplicate
        //HasSetBelowCanAccept randomNumber&NullValue
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("hashSet = " + hashSet);
        //  System.out.println( hashSet.get(4) ); <--HashSetICanNotUseTheIndexNumberToGetTheElements

       //SpecialRequirement alwaysGoFor LinkedHashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);

        //TreeSetGiveYouTheStandingOrder. IfYouGiveANullKeywordYouGetException. TreeSetNotAcceptNullKeyword COZ ThreeSet
        //IfUHaveSpecialScenarioGoWith-->treeSet helpYouToRemoveDuplicate&SortingInTheEnd
        // TreeSetImplicitCallTheElementYouStoredInThis->new TreeSet<>();.....
        //DifferenceBetweenHasSet&TreeSetIs BothClassDon'tNeedToCallTheMethodThrough theObject. TreeSet Automatically..
       //CallTheElementThatYouStoredInThis->new TreeSet<>();below.IfTheElementYouStoredIsNullThenUGetNullPointException
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //  treeSet.addAll(Arrays.asList(null,null,null));


        System.out.println("treeSet = " + treeSet);

        //   String str = null;
        // System.out.println(str.charAt(0));


    }


}