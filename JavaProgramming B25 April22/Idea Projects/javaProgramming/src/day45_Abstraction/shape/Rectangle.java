package day45_Abstraction.shape;
//Override the area() and I need to call the parent class constructor
//Cube & Cylinder class is the similar way to square & circle class
//Rectangle have toOverride
public class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
