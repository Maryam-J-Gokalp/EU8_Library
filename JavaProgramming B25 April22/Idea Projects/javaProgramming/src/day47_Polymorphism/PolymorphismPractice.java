package day47_Polymorphism;

import day38_Inheritance.day38_carTask.BMW;
import day38_Inheritance.day38_carTask.Car;
import day38_Inheritance.day38_carTask.Tesla;
import day38_Inheritance.day38_carTask.Toyota;

public class PolymorphismPractice {

    public static void main(String[] args) {


    //  1.1 Write a program that can display all the cars that are eligible for recall?
        //To iterate
        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };
        //UseForEachLoop to Iterate the array give arrayName on the right side of the colon & left side use variableName
        //LeftSide dataType should be referenceToAllSubject I needToReferenceTheParentClass ofAll subjectWhichIs Car
        for(Car eachCar  : cars ){
            if(eachCar instanceof Toyota){ //ToKnowCarObjectIsToyotaIUseInstanceKeyword-->if(eachCar instanceof Toyota){
                if(eachCar.year >= 2010 && eachCar.year <= 2011){ //IfCarToyotaYear 2010to2011 thenCarIsEligibleToCall
                    System.out.println(eachCar); //Then I can Print
                }
            }
            //ThisIsHowToCreateIfConditionToFindOutWhichCarisEligible 4EachCallAsLong instanceof BMWCarMeans IsEligible
            if(eachCar instanceof BMW){
                System.out.println(eachCar);
            }
            //Tesla is between 2015to2016 thenIsEligible For itCall, below is how to create an IfCondition to Tesla
            if(eachCar instanceof Tesla){ //<--IfCaris instanceof Tesla then
                if(eachCar.year >= 2015 && eachCar.year <= 2016){ //CheckIfTeslaCarIsBetween 2015&&eachCar.year<= 2016
                    System.out.println(eachCar); //THEN PRINT OUT
                }
            }


        }


        System.out.println("---------------------------------------------------------");
        // 1.2 Write a program that can display the car that has the highest mileage
        // 1.3 Write a program that can display the car that has the lowest mileage

        //ToFindOutCarHasMaximMileage FirstINeedToAssumeTheFirstCarHasHighestMileage->Car carWithHighestMileage=cars[0],

        Car carWithHighestMileage = cars[0],
                carWithLowestMileage =  cars[0];

        //NextIStill haveToCompareWithTheOtherCars example if the mileage car is 1000 and the NextMileageCaris2000
        // INeedToMakeSureTheCurrentIsReplaceTheFirstCar
        for (Car eachCar : cars) { //NextFindOutIfAnyCarHasHighMileage ofTheCurrentCar
            if(eachCar.miles > carWithHighestMileage.miles){ //<--TheApplyIfStatement
                carWithHighestMileage = eachCar; //IfTrueMakeSureReplace TheOldMileage
            }
           //DeclareAnotherVariableToFindOutCarHasLowerMileage by defaultIAssume1stCarHas LowestMileage
            if(eachCar.miles < carWithLowestMileage.miles){
                carWithLowestMileage = eachCar; //<--ThenCompareCarWithLowestMileage
            }
        }

        System.out.println(carWithHighestMileage); //ThePrintOut
        System.out.println(carWithLowestMileage); //ThePrintOut

    }

}


/*
1 Given the following array that contains the car objects:
				Car[] cars = {
		                new Toyota("Highlander", 2010, 25000, "White", 255000),
		                new BMW("X5", 2014, 32000, "Red", 12000),
		                new Toyota("Corolla", 2011, 20000, "White", 310000),
		                new BMW("M3", 2015, 33000, "Blue", 14030),
		                new BMW("M5", 2017, 35000, "Black", 15000),
		                new BMW("M4", 2018, 40000, "White", 19000),
		                new BMW("7 Series", 2009, 30000, "Purple", 21000),
		                new BMW("i3", 2011, 30000, "Black", 9000),
		                new Toyota("Camry", 2018, 30000, "Red", 185000),
		                new Toyota("Rav4", 2012, 23000, "Red", 285000),
		                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
		                new Tesla("Model 3", 2015, 45000, "White", 235000),
		                new Tesla("Model Y", 2017, 65000, "Black", 135000),
		                new Tesla("Model X", 2016, 48000, "White", 235000),
		                new Tesla("Model X", 2014, 48000, "White", 236000),
		        };
		        (import them from day38 package)
	        1.1 Write a program that can display all the cars that are eligible for recall
	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016
			1.2 Write a program that can display the car that has the highest mileage
			1.3 Write a program that can display the car that has the lowest mileage
 */