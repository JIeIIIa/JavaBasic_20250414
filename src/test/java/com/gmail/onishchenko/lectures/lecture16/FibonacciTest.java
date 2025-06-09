package com.gmail.onishchenko.lectures.lecture16;

import org.junit.jupiter.api.*;

public class FibonacciTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before test method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After test method");
    }

    @Test
    void negative() {
        // when + then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-42));
    }

    @Test
    @Disabled
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
