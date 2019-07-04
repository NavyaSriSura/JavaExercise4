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
      public void inputStringReturnIndexString() { //checks whether the expected output matches the result
          String result[] = multipleOccurence.stringOccurence("She sells seashells by the seashore","se");
          String expected[] = {"4 - 6","10 - 12","27 - 29"};
          assertArrayEquals(expected,result);
      }

      @Test(expected = NullPointerException.class) //checks for exception
      public void inputNullReturnException() {
          String result[] = multipleOccurence.stringOccurence(null,null);
      }

      @Test(expected = NullPointerException.class) //checks for exception
      public void inputNullSubstringReturnException() {
          String result[] = multipleOccurence.stringOccurence("Hello there", null);
      }

      @Test
      public void inputStringReturnIndex(){ //checks whether the expected output matches the result
          String result[] = multipleOccurence.stringOccurence("hello world"," ");
          String expected[] = {"5 - 6"};
          assertArrayEquals(expected,result);
      }
}