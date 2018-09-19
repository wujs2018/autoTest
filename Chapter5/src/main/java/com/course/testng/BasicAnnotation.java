package com.course.testng;
import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){

        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例1");
    }


    @BeforeMethod
    public void beforeMethod()
    {

        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @Test
    public void testCase2()
    {
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
        System.out.println("Test2这是测试用例2");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("AtfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("beforeclass这是在类运行之前的方法");
    }

    @AfterClass
    public void afterclass()
    {
        System.out.println("afterclass这是在类运行之后的方法");
    }

    @BeforeSuite
    public void beforeSuite()
    {

        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("AfterSuite测试套件");
    }

}

