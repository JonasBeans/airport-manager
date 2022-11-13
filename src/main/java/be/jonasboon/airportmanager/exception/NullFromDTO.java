package be.jonasboon.airportmanager.exception;

public class NullFromDTO extends RuntimeException{
    public NullFromDTO() {
        super("The dto has null values");
    }
}
