package com.stackroute;
import org.junit.*;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression obj;
    @Before
    public void setUp(){
        obj=new RegularExpression();
    }

    @After
    public void tearDown()
    {
        obj=null;

    }
    @Test
    public void testGivenHarryShouldReturnTrue()
    {
        String result=obj.findpresence("This is Harry","Harry");
        assertEquals("Is Harry here ?true",result);
    }
    @Test
    public void testGivenHenryShouldReturnFalse()
    {
        String result=obj.findpresence("This is Henry","harry");
        assertEquals("Is Harry here ?false",result);
    }
    @Test
    public void testGivenUpperCaseShouldReturnTrue()
    {
        String result=obj.findpresence("This is HaRRy","harry");
        assertEquals("Is Harry here ?true",result);
    }
    @Test
    public void testGivenNullShouldReturnNull()
    {
        String result=obj.findpresence(null,null);
        assertEquals(null,result);
    }

}
