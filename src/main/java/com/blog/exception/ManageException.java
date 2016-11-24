package com.blog.exception;

/**
 * 博客操作异常
 */

public class ManageException extends RuntimeException {

    public ManageException(String message) {
        super(message);
    }

    public ManageException(String message, Throwable cause) {
        super(message,cause);
    }

}
