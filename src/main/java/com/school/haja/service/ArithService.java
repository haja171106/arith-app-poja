package com.school.haja.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
