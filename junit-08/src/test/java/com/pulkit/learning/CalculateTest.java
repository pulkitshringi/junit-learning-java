package com.pulkit.learning;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculateTest {
    public CalculateTest(){
        System.out.println("object created and this is constructor");
    }
    Calculate obj;
    @BeforeAll
    void whatever(){ // make sure it's static method
        System.out.println("happens at the very beginning only");
    }
    @AfterAll
    void whateverrr(){
        System.out.println("Happens at the very last");
    }

    @BeforeEach
    void init(){
        obj = new Calculate();
        System.out.println("Executed before each test method");
    }
    @AfterEach
    void anyMethodName(){
        System.out.println("Executed after each method.");
    }

    @Test
    void squareArea() {
        assertEquals(25,obj.squareArea(5));
    }

    @Test
    void circleArea() {
        assertEquals(12.56,obj.circleArea(2));
    }


}