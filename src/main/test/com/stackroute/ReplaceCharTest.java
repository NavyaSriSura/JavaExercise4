package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    ReplaceChar replaceChar;

    @Before
    public void setUp() {
        replaceChar = new ReplaceChar();
    }

    @After
    public void tearDown() {
        replaceChar = null;
    }

    @Test
    public void testGivenStringShouldReplace() {
        String result = replaceChar.replace("daily dry");
        assertEquals(result, "faity fry");
    }

    @Test
    public void testGivenEmptyString() {
        String result = replaceChar.replace("");
        assertEquals(result, "Empty strings not allowed");
    }

    @Test(expected = NullPointerException.class)
    public void testGivenNullValue()
    {
        String result=replaceChar.replace(null);
    }
}