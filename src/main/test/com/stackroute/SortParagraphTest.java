package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParagraphTest
{
    SortParagraph sort;
    @Before
    public void setUp() throws Exception {
        sort= new SortParagraph();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestShouldReturnWordsInOrder(){
        String[] expected={"and","dance","eat","I","love","love","to","to"};
        String[] actual=sort.sortPara("I love to dance and love to eat");


        assertArrayEquals(expected,actual);
    }

    @Test
    public void TestShouldReturnErrorMessage(){
        String[] expected = {"should not enter empty string"};
        String[] actual = sort.sortPara("");
        assertArrayEquals(expected,actual);

    }

    @Test(expected = NullPointerException.class)
    public void TestShouldReturnNullException(){
        String[] result = sort.sortPara(null);

    }

}


