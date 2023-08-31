package edu.hw8_exeptions.NewExceptions;

public class ArrayDataException extends NumberFormatException{
    public ArrayDataException(String message, Throwable cause) {super(message);}

    public ArrayDataException(String message) {
        super(message);
    }
}
