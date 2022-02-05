package TestNGLecture;

import org.testng.annotations.*;

public class Before {
    @BeforeSuite
    public void beforeSuite () throws InterruptedException {
    //    Thread.sleep(5000);
        System.out.println("1 - beforeSuite");
    }
    @BeforeGroups
    public void beforeGroups () throws InterruptedException {
    //    Thread.sleep(5000);
        System.out.println("1 - beforeGroups");
    }
    @BeforeClass
    public void beforeClass () throws InterruptedException {
    //    Thread.sleep(5000);
        System.out.println("1 - beforeClass");
    }
    @BeforeTest
    public void beforeTest () throws InterruptedException {
      //  Thread.sleep(5000);
        System.out.println("1 - beforeTest");
    }
    @BeforeMethod
    public void beforeMethod () throws InterruptedException {
        //Thread.sleep(5000);
        System.out.println("1 - beforeMethod");
    }
    @Test
    public void test1 () throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("1 - test1");
    }
    @Test
    public void test2 () throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("1 - test2");
    }
    @Test
    public void test3 () throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("1 - test3");

        }
    }