package com.blog.exception;

public class AddException extends ManageException {

    public AddException(String message) {
        super(message);
    }

    public AddException(String message, Throwable cause) {
        super(message,cause);
    }
}
