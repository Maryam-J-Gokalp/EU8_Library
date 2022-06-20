package day40_FinalKeyword;

import day39_Recap.ShapeTask.Circle;
import day39_Recap.ShapeTask.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;

    //generateGetter & getter returnTypeMustMatchWith privateDataType Circle & the getterItReturnsThePrivateVariable
    //Regardless which Circle I am going to return toThe private variable I am going toGetCircleWhenI call Circle()
    public Circle getCircle(){
        return circle; //WhatGetterDoesReturnsPrivateVariable
    }
   //SetterIGeneratePublicAccessModifier & VoidReturnType InOrderToAssignAnewValue toTheVariableINeedToKnowWhatCircleIs
    //WhenIcallCircleIAssignANewCircleObjectToTheVariable ToSetTheVariableANewObjectMustBeGive
    //TheRuleForTheParameterIs theDataType mustMatchWith privateDateTypeCircle--> (Circle circle){
    //Ex:ICanAddACondition TheNewCircleCanNotBeSetLessThen5
    public  void setCircle(Circle circle){ //<--()dataTypeMatchPrivateDataType WhenUserCallMustProvideNewCircleObject
        if(circle.getRadius() < 5){ //ConditionCircleCanNotBeLessThen5, IfTheGivenCircle if(circle.getRadius() < 5)
            return; //<--IfRadiusIs <5 I can add RETURN() soTheArgument Won't reassign to the Circle
        }
  //ToAssignPrivateDataTypeToTheInstanceVariableCircleIMust,
        this.circle = circle; //
    }


    public Square getSquare() {
        return square;
    } //ReturnTypeOfGetter&parentheses are also square

    public void setSquare(Square square) {
        this.square = square;
    }


}