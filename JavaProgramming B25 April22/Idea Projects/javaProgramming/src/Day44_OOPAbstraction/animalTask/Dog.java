package Day44_OOPAbstraction.animalTask;

//First add additional field &() that cannot be inheritance from parent class BARK
//Extend parentClass then override() public void eat(){ ToOverrideUseGetName System.out.println(getName()+"eats Pizza");
// If I still getCompilerError at my class name Subclass mustCall parentClass constructor
//super Keyword callParent constructorClass toMake sure valid data setToTheVariable(name, breed,gender,age,size,color);
//Touse all the private fields in parent class to subclass I must use getName to inherit all the private fields
public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {//parentClassConstructor
        super(name, breed, gender, age, size, color);//super Keyword call parent class constructor
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }


    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }

    public void play(){
        System.out.println(getName() +" is playing with ball");
    }


}