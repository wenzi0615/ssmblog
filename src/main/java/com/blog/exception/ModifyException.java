package com.blog.exception;

public class ModifyException extends ManageException {

    public ModifyException(String message) {
        super(message);
    }

    public ModifyException(String message, Throwable cause) {
        super(message,cause);
    }
}
