package com.pulkit.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void test() {  // using Junit 5
        ReverseString obj = new ReverseString();
        assertEquals("ikoop", obj.reverseString("pooki"));
        assertEquals("apap", obj.reverseString("papa"));
    }
}