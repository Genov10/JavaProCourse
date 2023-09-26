package edu.hw12_dictionaries.myExaptions;

public class UnavailablePath extends Exception{
    public UnavailablePath (String message) {
        super(message);
    }
    public UnavailablePath (String message, Throwable cause) {
        super(message, cause);
    }
}
