package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeWordsTest {
    TransposeWords transposeWords;

    @Before
    public void setUp() throws Exception
    {
        transposeWords=new TransposeWords();
    }

    @After
    public void tearDown() throws Exception
    {
        transposeWords=null;
    }
    @Test
    public void testGivenStringReturnTranspose()
    {
        String result=transposeWords.reverseString("a quick brown fox jumps over the lazy dog");
        assertEquals(result,"a kciuq nworb xof spmuj revo eht yzal god");
    }
    @Test
    public void testGivenEmptyStirng()
    {
        String result=transposeWords.reverseString("");
        assertEquals(result,"Empty strings not allowed");
    }
    @Test(expected = NullPointerException.class)
    public void testGivenNullShouldRaiseException()
    {
        String  result=transposeWords.reverseString(null);
    }
}