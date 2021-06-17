package com.bridgelabz;

public class StateCodeException extends Exception {

    enum ExceptionType {
        STATE_FILE_PROBLEM, FILE_TYPE_NULL, FILE_TYPE_PROBLEM;
    }

    ExceptionType type;
    public StateCodeException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
