package com.example.reactsimplecalculator.controller;

import com.example.reactsimplecalculator.exception.UnsupportedOperationException;
import com.example.reactsimplecalculator.model.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OperationController {

    private static final String operationRegex = "[*/+-]";

    @RequestMapping(method = RequestMethod.GET, value="/calculate")
    public Result calculate(@RequestParam(value="a") double a,
                            @RequestParam(value="b") double b,
                            @RequestParam(value="op") String op) {

        if(!op.matches(operationRegex)) {
            throw new UnsupportedOperationException("Unsupported operation");
        }

        double result;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                result = Double.NaN;
        }

        return new Result(result);
    }
}