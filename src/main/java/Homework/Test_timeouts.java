package Homework;

import org.testng.annotations.Test;

public class Test_timeouts {
    @Test(timeOut = 7000)
    public void timeout1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Timeout1");
    }
    @Test(timeOut = 8000)
    public void timeout2() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Timeout2");
    }
    @Test(timeOut = 500)
    public void timeout3() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Timeout3");
    }
}
