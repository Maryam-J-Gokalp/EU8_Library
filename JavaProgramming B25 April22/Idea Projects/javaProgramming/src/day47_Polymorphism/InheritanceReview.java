package day47_Polymorphism;

public class InheritanceReview {

    int a;

    //ICanNotInheritConstructor,but SubClassMustCall ParentClassConstructor ParentClass Constructor in Block below
    //When you create an statement for class A,B,C Etc...means Parent class constructor still get execute as well
    //Even if is not inherit but the child class is calling implicit coz parentClass constructor is default
    public InheritanceReview(int a){ //is compileCoz I needToApply
        System.out.println("Parent class' constructor");
    }
    void method1(){ //I can Inherit the()

    }
}
//If wasNot default then the child class We have to call manually & in order to call the constructor in the subclass
//WeMustHave a constructorFirstCOZOnly constructorCall AnotherConstructor & WhenWeCallAParent classConstructor
//We must use superKeyword if there is no Inheritance COZ SuperKeyWork is relatedToInheritance
//ToUse superKeyword You haveToHaveInheritance
class A extends  InheritanceReview{

    public A(int a) {
        super(a);
    }
}

class B extends  InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends  InheritanceReview{

    public C(int a) {
        super(a);
    }
}


class Aa extends A{  //So childClass canStill extend and HaveChildClass

    public Aa(int a) {
        super(a);
    }
}
//1 parentClass can have multiply child class, but child class can have one parent class
class Bb extends B{  //B Class can extend by another class

    public Bb(int a) {
        super(a);
    }
}

class Cc extends C{

    public Cc(int a) {
        super(a);
    }
}

class D{
    void m(){
        super.toString(); // Object class
    }
}

/*
ParenClass must class must call in child class, if parent class is default will call automatically otherwise
We have to call manually

 */