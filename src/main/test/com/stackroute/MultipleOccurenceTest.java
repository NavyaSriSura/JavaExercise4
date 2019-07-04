package com.stackroute;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class MultipleOccurenceTest {

      MultipleOccurence multipleOccurence;

      @Before
      public void setUp() {
          multipleOccurence = new MultipleOccurence();
      }

      @After
      public void tearDown() {
          multipleOccurence = null;
      }

      @Test
      public void testInputStringReturnIndexString() {
          //checks whether the expected output matches the result
          String result[] = multipleOccurence.stringOccurence("She sells seashells by the seashore","se");
          String expected[] = {"4 - 6","10 - 12","27 - 29"};
          assertArrayEquals(expected,result);
      }

      @Test(expected = NullPointerException.class) //checks for exception
      public void testInputNullReturnException() {
          String result[] = multipleOccurence.stringOccurence(null,null);
      }

      @Test(expected = NullPointerException.class) //checks for exception
      public void testInputNullSubstringReturnException() {
          String result[] = multipleOccurence.stringOccurence("Hello there", null);
          assertNull(result);
      }

      @Test
      public void testInputStringReturnIndex(){
          //checks whether the expected output matches the result
          String result[] = multipleOccurence.stringOccurence("hello world"," ");
          String expected[] = {"5 - 6"};
          assertArrayEquals(expected,result);
      }

      @Test
    public void testInputSpecialCharacters()
      {
          String result[] = multipleOccurence.stringOccurence("h@! hello","@!");
          String expected[] = {"1 - 3"};
          assertArrayEquals(expected,result);
          assertEquals("test case passed",expected,result);
      }

    @Test
    public void testInputNumbers()
    {
        String result[] = multipleOccurence.stringOccurence("2019-20","19");
        String expected[] = {"2 - 4"};
        assertArrayEquals(expected,result);
        assertEquals("test case passed",expected,result);
    }
}