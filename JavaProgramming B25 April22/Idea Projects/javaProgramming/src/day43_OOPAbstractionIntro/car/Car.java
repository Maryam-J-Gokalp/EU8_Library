package day43_OOPAbstractionIntro.car;

//ToMake theClassAbstract applyAbstract keyword B4 class Car{
public abstract class Car {

    //If I have all instance variable for brand,model,colour & price I should make then private
    //I made them private means multy copy are needed

    //declare colour separate coz colour can be chang
    private final String brand,model;//Apply FINAL Keyword To Make Brand,Car Model & year unchangeable, not be reassign
    private String color;
    private final int year;//before use instanceVariable needToHaveObject first then compiler error will be gone
    private double price;

    //So by the timeObject is created constructorGetExecuted
    // I can still use Constructor ToSetAll the Above Instances including the final ones...>Generate+constructor+ok
    //IfUHad Condition 4Setting this keyword itWon't be applicable coz constructorAssign toTheBrandWithoutCheckCondition
    //If you don't have the setter the constructor can set them,
    //ConditionCarPriceCannot be 0 or negative,If is 0 or NegativeICan ThrowException 2exitTheProgram
    //Dater does not have setter then u can give the condition within the constructor
    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color );//Use setter to implement a valid dater to the instance variable
    //If U haveCondition beforeSetYear U canApply throw keyword within the constructorIf statementGiven BeforeSetTheYear
        if(year < 1886) {//Implement a Condition toMakeSureTheRight dataSetTheYear otherwise the programmeGetTerminated
            throw new RuntimeException("Invalid Year:"+ year);//ifYear NotAvailable throwException ProgramGetTerminated
        }
        this.year = year;//U need to check before set &If is valid you can apply to the variable-->this.year = year;
        setPrice(price);//Variable I need to call setter to setColor & price setColor(color );
    }

    //If they are private to make sure other classes are need to set, We need to generate getter &setter
    // or I can generate the getters first then the setter
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if(price <= 0){//IfSetter conditionIsFixedYouCanApply ThrowException 2exitTheProgramIf ConditionIs 0 or negative
            throw new RuntimeException("Invalid price: "+price); //ThrowKeyword is used to throw unchecked exception
        }

        this.price = price;
    }

    public  void stop(){//Condition must be given to the car
        System.out.println("Press the brake");//to stop the car apply condition press the brake
    }

    //parent class does not care aboutThe details only the essential is that's why create() withoutBodyUGetCompilerError
    //Create bodyWithout()Use abstract keywordBefore()ReturnType OnceUGiveAbstractKeyword compilerKnow() doesNotHaveBody
    //UCanStillGetCompilerError coz TheTwoWayUGetAbstraction by use AbstractClass or InterFaCe I can use abstract Class
    //IfClassIsNot abstract ClassCannotHave abstract(),INeedToMake theClassAbstract applyAbstract keyword B4 class Car{
    //Abstract and final u cannot use them at the same time coz they cannot get along
    public abstract void start();//create() without theBodyUseAbstractKeyword The()mustBe overridden


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}


