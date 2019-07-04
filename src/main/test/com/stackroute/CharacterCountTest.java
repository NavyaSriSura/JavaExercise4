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
    }
    @Test(expected = NullPointerException.class)
    public  void testGivenNullShouldRaiseException()
    {
        String  result=characterCount.countCharacter(null,null);
    }

   @Test
    public void testGivenStringReturnZero()
   {
       String result=characterCount.countCharacter("stackroute","b");
       assertEquals(result,"0");
   }
   @Test
    public void testGivenEmptyString()
   {
       String result=characterCount.countCharacter("","a");
       assertEquals(result,"Empty strings not allowed");
   }
}