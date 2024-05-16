package com.keepassdroid.test;
import static org.junit.Assert.assertEquals;

import com.keepassdroid.crypto.CryptoUtil;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void testResizeKey() {
        byte[] in1 = {1, 2, 3, 4};
        int inOffset1 = 0;
        int cbIn1 = 4;
        int cbOut1 = 0;
        byte[] result1 = CryptoUtil.resizeKey(in1, inOffset1, cbIn1, cbOut1);
        assertEquals(0, result1.length);
    }
}
