package edu.hw8_exeptions.NewExceptions;

public class ArrayDataException extends NumberFormatException{
    public ArrayDataException() {}

    public ArrayDataException(String message) {
        super(message);
    }
}
