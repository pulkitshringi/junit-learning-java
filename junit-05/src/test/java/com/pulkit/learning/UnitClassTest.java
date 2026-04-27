package com.pulkit.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitClassTest {
    UnitClass obj = new UnitClass();
    @Test
    public void multTest(){
        assertEquals(10, obj.mult(2, 5));
    }
    @Test
    public void addTest(){
        assertEquals(20, obj.add(10, 10));
    }
}