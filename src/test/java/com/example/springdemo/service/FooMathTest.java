package com.example.springdemo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooMathTest {

        @Test
        void add() {
            FooMath fooMath = new FooMath();
            assertEquals(5, fooMath.add(2, 3));
        }
}