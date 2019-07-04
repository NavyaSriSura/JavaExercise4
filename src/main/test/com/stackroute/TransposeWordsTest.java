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
        assertNotNull(result);
    }
    @Test
    public void testGivenEmptyStirng()
    {
        String result=transposeWords.reverseString("");
        assertEquals(result,"Empty strings not allowed");
        assertNotNull(result);
    }
    @Test(expected = NullPointerException.class)
    public void testGivenNullShouldRaiseException()
    {
        String  result=transposeWords.reverseString(null);
        assertNull(result);
    }

    @Test
    public void testGivenSpecialCharacters()
    {
        String result=transposeWords.reverseString("@ qu!ck brown (fox) jump$ over the 1azy dog");
        assertEquals(result,"@ kc!uq nworb )xof( $pmuj revo eht yza1 god");
        assertNotNull(result);
    }

    @Test
    public void testGivenDigits()
    {
        String result=transposeWords.reverseString("1 23 456");
        assertEquals(result,"1 32 654");
        assertNotNull(result);
    }
}