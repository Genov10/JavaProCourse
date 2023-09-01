package edu.hw8_exeptions.NewExceptions;

public class ArraySizeException extends ArithmeticException{
    public ArraySizeException(String message, Throwable cause) {}

    public ArraySizeException(String message) {
        super(message);
    }
}
