package Homework;
import org.testng.annotations.Test;

public class Test_ignore {
        @Test(enabled = true)
        public void test1 () {
            System.out.println("Test ignore 1");
        }

        @Test(enabled = false)
        public void test2() {
            System.out.println("Test ignore 2");
        }

        @Test(enabled = false)
        public void test3() {
            System.out.println("Test ignore 3");
        }
    }

