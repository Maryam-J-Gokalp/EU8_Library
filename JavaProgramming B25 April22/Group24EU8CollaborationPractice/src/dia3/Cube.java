package dia3;

//Override the area() and I need to call the parent class constructor
//Cube & Cylinder class is the similar way to square & circle class
// LSA = Lateral Surface Area of a Cube, SA = Surface Area
//StaticVariable that is final I can set them directly lsa = 4 * 6 * 6; or I can use static block
public class Cube extends Shape implements Volume{

    private float SA,Volume, LSA;
    private double sa = 6 * 6 * 6; // This private variable name is not final means I can generate getter&setter
    private double volume = 6 * 6 * 6; // This private variable name is not final means I can generate getter&setter
    public final static double lsa = 4 * 6 * 6;

    public Cube(float SA, float volume, float LSA, double sa, double volume1) {
        super("Cube"); //Here I can give the name circle to set parent class to the name will be set
       setSA(SA); // thisKeywordOnlyAssignTheArgument toTheInstance,Use setter coz it's Check IfIs Valid Argument
    }
    public float getSA() {
        return SA;
    }
    public void setSA(double SA) {
            if(sa < 0) { // to make sure sa cannot be < 0, I need to throw an exception
                throw new RuntimeException("Invalid sa:" + sa);//throw ExceptionProgrammeToTerminated ifInvalidIsGiven

            }
        this.SA = (float) SA;
    }
    public void setSA(float SA) {
        this.SA = SA;
    }
    public float getVolume() {
        return Volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setVolume(float volume) {
        Volume = volume;
    }
    public float getLSA() {
        return LSA;
    }
    public void setLSA(float LSA) {
        this.LSA = LSA;
    }

    @Override
    public double area() {
        return 6 * 6 * 6; //SA = 6 * (length * length);
    }

    @Override
    public double perimeter() {
        return  6 * 6 * 6; //Volume = length * length * length;
    }

    @Override
    public double volume() {
        return 4 * 6 * 6; // LSA = 4 * (length * length);
    }

    public String toString() {
        return "Cube{" +
                "SA=" + SA +
                ", Volume=" + Volume +
                ", LSA=" + LSA +
                ", sa=" + sa +
                ", volume=" + volume +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

