package com.gmail.onishchenko.lectures.lecture16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    void one() {
        // given

        int expected = 3;

        // when
        int result = Fibonacci.fibonacci(1);

        // then
        Assertions.assertEquals(expected, result);
    }


    @Test
    void tree() {
        int result = Fibonacci.fibonacci(3);
    }

    @Test
    void six() {
        int result = Fibonacci.fibonacci(6);
    }
}
