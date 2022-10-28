package com.integrifytask.bookmarkingproject.Exception;

public class BookmarkNotFoundException extends  RuntimeException {
    public BookmarkNotFoundException(String message) {
        super(message);
    }
}
