package edu.hw12_dictionaries.myExaptions;

public class FileAlreadyExist extends Exception{
    public FileAlreadyExist(String message) {
        super(message);
    }
    public FileAlreadyExist(String message, Throwable cause) {
        super(message, cause);
    }
}
