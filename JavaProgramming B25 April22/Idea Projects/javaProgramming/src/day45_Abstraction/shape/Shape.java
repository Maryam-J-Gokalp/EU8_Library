package day45_Abstraction.shape;

// First I need to work on parent class shape & I need to store the common feature shape
//such as nam, area, perimeter,add private access modifier forExampleToMakeName unchangeable & I canApply final keyword
//ParentClass hasAbstract() will inherit to subclass.If I makeMy subclass abstract I canNotCreate Object FromParentClass
//That's why I cannot make subclass Abstract either
//Second apply override () coz every subClass() must have a body
//Third I must call constructor from parent class
//To make sure that all the subclass cannot be super class I must apply Final keyword
//Why abstract class coz is meant to be a parent class of subclasses & meant to contain common feature only
//I can have in my abstract class instance variable constructor, instance() & abstract()
//If I have interface I get compiler error is that's why use abstract class
public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //Override isTheOnlyWayU canGiveImplementation 2The childClass & everyAbstract classMutBeOverridden 2CompletThe()
    //For abstract()ICan onlyGive publicAccessModifier,But IDont haveRule forReturnType (void&double) & method name AREA
    //u CanOverride theArea() depends on the ChildClass
    public abstract double area();//Return typeCouldBe,void or double nao importa.Mais Access modifierCanNotMakePrivate

    public abstract double perimeter();

    // apply toString() change getName otherwise isGoing toReturn Shape ClassName 2 every class I need to get clasName
    //To get Class name is toString() I must add in my superclass return getClass().getSimpleName()+"{" +
    //get simple name returnsYou what the class name is public Shape(String name){this.name = getClass().getSimpleName();
    @Override
    public String toString() {//toString() get me the shape& ICan modify by add name,area & perimeter
        return getClass().getSimpleName()+"{" + //getClass()return packageName.ToReturnClassOnly AddgetSimpleName()+"{"+
                "name='" + name + '\'' + //later I just want to assign class name to I can get Through the ()
                        ", area='" + area() + '\'' +
                        ", perimeter='" + perimeter() + '\'';

    }


}