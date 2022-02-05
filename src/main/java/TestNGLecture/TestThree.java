package TestNGLecture;

import org.testng.annotations.*;

public class TestThree {
    @BeforeSuite
    public void beforeSuite () {
        System.out.println("3 - beforeSuite");
    }
    @BeforeGroups
    public void beforeGroups () {
        System.out.println("3 - beforeGroups");
    }
    @BeforeClass
    public void beforeClass () {
        System.out.println("3 - beforeClass");
    }
    @BeforeTest (groups = "groupDemo")
    public void beforeTest () {
        System.out.println("3 - beforeTest");
    }
    @BeforeMethod
    public void beforeMethod () {
        System.out.println("3 - beforeMethod");
    }
    @Test (groups = "groupDemo")
    public void test1() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("3 - test1");
    }
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("3 - test2");
}
    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("3 - test3");
    }
}
