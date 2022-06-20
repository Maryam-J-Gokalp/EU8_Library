package Day44_OOPAbstraction.animalTask;

//ParentClass hasAbstract() will inherit to subclass.If I makeMy subclass abstract I canNotCreate Object FromParentClass
//That's why I cannot make subclass Abstract either
//First apply override () coz every subClass() must have a body
//Second I must call constructor from parent class
//I must add any unique method animal have that cannot inherit from the subclass
//To make sure that all the subclass cannot be super class I must apply Final keyword
public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating biryani");
    }

    public void meow(){
        System.out.println(getName() + " is Meowing");
    }


    @Override
    public void play() {

    }

}