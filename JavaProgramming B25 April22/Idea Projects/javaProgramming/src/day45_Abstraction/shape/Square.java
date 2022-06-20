package day45_Abstraction.shape;

//First Apply unique feature for the square class such as side
//If make private generate getter&setter
//ExampleB4 setSquareSide ifYouHaveSuchConditionOf..>if(side <= 0){
// //throw ExceptionProgrammeToTerminated ifInvalidIsGiven
//After write addition and method then square class can inherit shape class apply extends keyword,apply toString()
//If You generate toString() IncludeSideOnly then you need to call parentClas toString() super.toString()+
// //insteadOfWriteToString()1-by-1 ICall ParentClass super.toString() 2 Inherit
//setThe sideOfConstructor rightClickGenerateConstruct to include the square and to set the square side
public class Square extends Shape{

    private double side;

    public Square( double side) { //setThe sideOfConstructor rightClickGenerateConstruct to include the square side
        super("Square");//name of square be square
        setSide(side); //instead of this keyword use the setter to set the side
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            throw new RuntimeException("Invalid Side: "+side); //throw ExceptionProgrammeToTerminated ifInvalidIsGiven
        }
        this.side = side;
    }


    public double area() {//when you call area and perimeter return you area of perimeter
        return side * side;} //implementation U need to complete the side and area of the square

    public double perimeter() { //perimeter of square find info on Google
        return side * 4;} //implementation U need to complete the side and area of the square

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+ //insteadOfWriteToString()1-by-1 ICall ParentClass super.toString() 2 Inherit
                "side=" + side +
                '}';
    }


}