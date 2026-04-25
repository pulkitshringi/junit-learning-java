package com.pulkit.learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void test(){
        ReverseString obj = new ReverseString();
        assertEquals("ikoop", obj.reverseString("pooki"));
        assertEquals("mitu", obj.reverseString("dhoop"));
    }
}