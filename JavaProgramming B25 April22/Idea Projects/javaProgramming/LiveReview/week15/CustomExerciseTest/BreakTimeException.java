package week15.CustomExerciseTest;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(String message){
        super(message); // call the constructor of RunTimeException class
    }
}