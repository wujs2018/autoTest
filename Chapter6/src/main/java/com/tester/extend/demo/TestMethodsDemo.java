package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void Test1()
    {
        Assert.assertEquals(1,2);
    }

    public void test2()
    {
        Assert.assertEquals(1,1);
    }
}
