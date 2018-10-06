package com.example.reactsimplecalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedOperationException extends RuntimeException {

    public UnsupportedOperationException(String exception) {
        super(exception);
    }
}
