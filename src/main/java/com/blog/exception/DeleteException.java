package com.blog.exception;

public class DeleteException extends ManageException {

    public DeleteException(String message) {
        super(message);
    }

    public DeleteException(String message, Throwable cause) {
        super(message, cause);
    }
}
