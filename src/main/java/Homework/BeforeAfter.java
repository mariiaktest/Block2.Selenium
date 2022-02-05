package Homework;

import org.testng.annotations.*;

public class BeforeAfter {
    @AfterSuite
    public void afterSuite() {
        System.out.println("1 - afterSuite");
    }
    @AfterGroups
    public void afterGroups() {
        System.out.println("1 - afterGroups");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("1 - afterClass");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("1- afterMethod");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }
}

