package variousTestNgConcepts;

import org.testng.annotations.Test;

public class TestCases {

    @Test
    void setUp(){
        System.out.println("I am inside setUp");
    }
    @Test(priority = 1)
    void testSteps(){
        System.out.println("I am inside testSteps");
    }
    @Test
    void tearDown(){
        System.out.println("I am inside tearDown");
    }

}
