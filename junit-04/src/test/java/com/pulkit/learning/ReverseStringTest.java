package com.pulkit.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString obj = new ReverseString();
        @Test
    public void someTestone(){
            assertEquals("lol", obj.reverseString("lol"));
        };
        @Test
    public void someTesttwo(){
        assertEquals("mub", obj.reverseString("bum"));
    }
}