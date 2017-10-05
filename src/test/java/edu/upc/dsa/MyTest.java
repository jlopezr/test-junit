package edu.upc.dsa;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {

    private TestJunit o;

    public MyTest() {
        o = new TestJunit();
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(5, o.suma(2,3));
    }

    @Test
    public void test2() throws Exception {
        Assert.assertEquals(1, o.suma(-10,10));
    }
}