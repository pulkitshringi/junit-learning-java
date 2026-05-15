package com.pulkit.platform;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatformTest {
    @Test
    public void test(){
        int[] arr1= {3, 4, 6, 8};
        int[] arr2= {3, 4, 6, 8};
        assertArrayEquals(arr1, arr2);
    }
}
