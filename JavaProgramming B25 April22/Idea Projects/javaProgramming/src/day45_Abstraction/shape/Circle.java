package day45_Abstraction.shape;

/*
interface XX{
}
interface YY{
}
abstract class BB{
}
abstract class AA{
}
*/

//Getter&Setter benefit are you can control and add conditions what can be set and access to the radius
//To makeSure radius cannotBe <0 if(radius < 0),I needTo throw anException TheProgrammeTo Terminated if Invalid is given
//After I apply()Override I still have compiler error coz I need to call parent class in the childClass , so therefore
//I need to generate the constructor to call the parent class constructor, I mustGenerate a constructor In CircleClass
public class Circle extends Shape {

    private double radius; // This private variable name is not final means I can generate getter&setter

    //StaticVariable that is final I can set them directly pi = 3.14; mor I can use static block
    public final static double pi = 3.14;

   // I need to generate the constructor to call the parent class constructor.
    //Once you apply if U get additional argument such as String name inside my constructor() I must delete
   //OnceGenerate constructor IGet superKeyword byDefault & is callTheParentClass constructor
    public Circle( double radius) {
        super("Circle");//Here I can give the name circle to set parent class to the name will be set
        setRadius(radius);//thisKeywordOnlyAssignTheArgument toTheInstance,Use setter coz it's Check IfIs Valid Argument
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){ // to make sure radius cannot be if(radius < 0), I need to throw an exception
            throw new RuntimeException("Invalid Radius:"+radius);//throw ExceptionProgrammeToTerminated ifInvalidIsGiven
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi; //WhatEver the implementation u wantToGive toCalculate theAreaYou can give here
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi; //WhatEver theImplementation you want to give u can give here-->return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+ //use super keyword to call toString() from parent class
                ", radius=" + radius +
                '}';
    }
}



