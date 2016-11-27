package com.blog.exception;

/**
 * 博客操作异常
 */

public class ManagementException extends RuntimeException {

    public ManagementException(String message) {
        super(message);
    }

    public ManagementException(String message, Throwable cause) {
        super(message,cause);
    }

}
