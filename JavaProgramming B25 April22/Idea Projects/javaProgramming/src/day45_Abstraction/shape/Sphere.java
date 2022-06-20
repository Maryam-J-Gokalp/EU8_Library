package day45_Abstraction.shape;

//Override the area() and I need to call the parent class constructor
//Cube & Cylinder class is the similar way to square & circle class
public class Sphere extends Shape implements Volume{


    public Sphere(String name) {
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

    @Override
    public double volume() {
        return 0;
    }
}