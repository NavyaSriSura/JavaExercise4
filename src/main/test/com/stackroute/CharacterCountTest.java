package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCountTest {
 CharacterCount characterCount;
    @org.junit.Before
    public void setUp() throws Exception
    {
        characterCount=new CharacterCount();
    }

    @org.junit.After
    public void tearDown() throws Exception
    {
        characterCount=null;
    }
    @Test
    public void  testGivenStringReturnNumberOfOccurences()
    {
        String result=characterCount.countCharacter("stackroute","t");
        assertEquals(result,"2");
        assertNotNull(result);
    }
    @Test(expected = NullPointerException.class)
    public  void testGivenNullShouldRaiseException()
    {
        String  result=characterCount.countCharacter(null,null);
        assertNull(result);
    }

   @Test
    public void testGivenStringReturnZero()
   {
       String result=characterCount.countCharacter("stackroute","b");
       assertEquals(result,"0");
       assertNotNull(result);
   }

   @Test
    public void testGivenEmptyString()
   {
       String result=characterCount.countCharacter("","a");
       assertEquals(result,"Empty strings not allowed");
   }

   @Test
    public void testGivenNumbersReturnresult()
   {
       String result=characterCount.countCharacter("123 32 456","2");
       assertEquals(result,"2");
       assertNotNull(result);
   }

   @Test
    public void testGivenSpecialSymbols()
   {
       String result=characterCount.countCharacter("$!!@ &*!","!");
       assertEquals(result,"3");
       assertNotNull(result);
   }

}