package Day44_OOPAbstraction.animalTask;

// Animal task Must be created first coz is a superClass )
//First set variable, Second add Getter&Setter, third add constructor to set all instance variable then apply toString()
//MadePrivateToHaveMoreControl with Variable and to Use getter&setter.You can implement any condition in  getter&setter
//If U want 1 copy toCreate 4 all Object use STATIC & Multi copyToCreate forAllObject Method or variable use INSTANCE
//If final variable give u compilerError is coz you need to set by the time you use them
//U need to add CONSTRUCTOR afterApply GETTER&SETTER toCreate anObject & CONSTRUCTOR getExecuted as SoonYouCreate Object
public abstract class Animal {

   private String name; //if u did not had getter&setter u won't be able to add any condition to modify the data
    private final String breed;//to stay unchangeable make breed final.Declare instance means all animals has same breed
    private final char gender; //set instance they have different gender to make unchangeable apply final To
    private  int age;//dog age can change static
    private String size;
    private final String color; // make final color cannot change apply static

    public final static boolean canBreath; //VariableValue canBreath needToTStayTrue neverChangeToFalse Use final
    static{
        canBreath = true;
    }
    //Instance variable that are final use Constructor to set them below to avoid the errors
    //what ever argument is it assign 2 theInstance name u can use this or setter it doesTheSame thing
    //Advantage use the setter is if there is any condition to setTheName,age&Size such as nameCannotBe Blank,empty
    //When you call the setter it check the value if is value if is valid then assign to the instance variable
    //ToGiveAnyCondition Inside TheConstructor COZ I am Using This Keyword inTheConstructor toSet Breed,Color&Gender
    //conditionApply B4 gender & IfIsInvalid CodeFragmentDoesNotGetExecute create uncheckException to use codeExecute 1X
    //If you have a constructor that call the method for you, means you don't need to write the codeFragment again
    //You just call the setter to check the condition and B4 assign to the animal instance variable name
    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        this.breed = breed;
        if ( !(gender == 'M' || gender =='F')){//conditionApply B4 gender & IfIsInvalid CodeFragmentDoesNotGetExecute
            throw new RuntimeException("Invalid gender: "+gender);//instead ofExit the() Create uncheck exception
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }
    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){
        System.out.println(name+" is drinking");
    }

    public abstract void eat();

    public abstract void play();

    // apply toString() change getName otherwise isGoing toReturn animalClassName 2 every class I need to get clasName
    //To get Class name is toString() I must add in my superclass return getClass().getSimpleName()+"{" +
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + //getClass()return packageName.ToReturnClassOnly AddgetSimpleName()+"{"+
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)
			Encapsulate all the fields
			Add a constructor that can set all the fields
			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */


/*
class Test{
    public static void main(String[] args) {
        System.out.println(new Test().getClass().getSimpleName());
        System.out.println(new Test().getClass().getName());
    }
}
*/

/*
//if I have an expection for the name cannot be empty I can Through an exeption in the setter
//calling the setter means you can apply this condition as well means that theCode only get executed if the name isValid
//IfValid animal name otherwise create an exception, so If I use this keyword to set the name if you
//Had the same code fragment in the setter you do not need to repeat again the same codeFragment
//If you have a constructor that call the method for you, means you don't need to write the codeFragment again
//You just call the function

Public String getName() {return name;}
public void setName(String name){
if(name.isEmpty()){
throw new RuntimeException("Invalid Name");
 */

