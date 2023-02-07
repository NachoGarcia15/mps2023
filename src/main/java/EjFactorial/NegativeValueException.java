package EjFactorial;

public class NegativeValueException extends RuntimeException{
    public NegativeValueException(String errorMessage) {
        super(errorMessage);
    }

}
