package com.pulkit.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {
    @Test
    public void multTest(){
        Maths obj = new Maths();
        assertEquals(12, obj.mult(6, 3), () -> "test failed boi");
    }
}