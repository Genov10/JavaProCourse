package edu.hw8_exeptions.NewExceptions;

public class ArraySizeException extends ArithmeticException{
    public ArraySizeException() {}

    public ArraySizeException(String message) {
        super(message);
    }
}
