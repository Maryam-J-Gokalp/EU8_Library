package day47_Polymorphism;

public class EncapsulationReview {

    //By making the data privateI canNot haveAccess outside the class
    //OnlyWayICanHave accessIsThroughThe getter&setter,ThereIsNoRestriction & UCanAlwaysRead Through the getter
    //For the setter thereIsRestriction U haveToMakeSure the private dataIsNotFinal through the setter
    //However if the private data is final u can only generate the getter but u canNotGenerate the setter
    //GetterReturn Type has to match to the Private data type-->String
    //The setterOnlyUse 4 set & DoesNotReturn AnyValue atAll U canNotChange the variableValue is thatWhyIsVoid()
    //GetterDoes notHaveParameters Coz getterUCanOnly readTheVariableValue
    //SetterUNeed ToAssignANewDataToTheVariable soThereForeANewData AreNeededInOrderToSet isThat setterHas()(bookTitle);
    private String bookTitle;
    private final String publishDate; //When is finalRequire for to set immediate within the constructor

    public EncapsulationReview(String bookTitle, String publishDate) {
        // this.bookTitle = bookTitle;
        setBookTitle(bookTitle); //
        this.publishDate = publishDate;//IfUDon'tHaveSetterUCanGiveCondition inTheConstructorB4 SetTheFinal
    }
     //StillPossibleToGiveTheCondition InTheGetter IfIGiveTheCondition-->if(bookTitle==null){
    //IfBookTitleIsNull byDefaultReturnUEmptyString
    //DifferentBetween Null&EmptyString is Null:NotObject atAll & EmptyString: is additional object
    //If additionalObject U can call the method of String instance of the string
     //IfIConditionIsNull U CanNotCallAnyInstance form the String.TheCondition WereGivenToPrevent Null point exception
    //U Can also add condition to the get if is necessary
    public String getBookTitle() {
        if(bookTitle == null){
            return "";   //ICanReturnEmpty String-->return ""; or I can Through an exception
        }
        return bookTitle;
    }
   //MyCondition to the setter below
    //You can give the condition when private data is private but not public
    //COZ Public U can call anyWhereU don't needTo use Getter&SetterTo call & U can assign anyString to it
    //To have more control of private data we can use getter and setter
    //B4 Assign any dataDoSecurityCheck to MakeSureAny data iF BLOCK BELOW is valid B4 set

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){  //SetterCondition BookTitleSetToNull or ifBookTitleIsEmpty
            throw new RuntimeException("Invalid Data"); //Then I can throw an exception
        }
        this.bookTitle = bookTitle; //Instead set the data to the book title, I can throw an exception above
    }

    public String getPublishDate() {
        return publishDate;
    }


}