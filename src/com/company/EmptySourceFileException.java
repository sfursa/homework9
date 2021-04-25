package com.company;

public class EmptySourceFileException extends Exception {
    public EmptySourceFileException() {
    }

    public EmptySourceFileException (String message){
        super(message);

    }
}
