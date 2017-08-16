package maks.sample.controller;

public class EmailExistsException extends Exception {
    public EmailExistsException() {
    }

    public EmailExistsException(String s) {
        super(s);
    }
}
