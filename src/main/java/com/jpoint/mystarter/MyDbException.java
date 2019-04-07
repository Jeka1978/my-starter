package com.jpoint.mystarter;

/**
 * @author Evgeny Borisov
 */
public class MyDbException extends RuntimeException{
    public MyDbException(String message) {
        super(message);
    }
}
