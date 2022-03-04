package chapterEleven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {
             @Test
            public void  weirdTest() throws Exception {
            ExceptionHandling exceptionHandling = new ExceptionHandling();
            try {
                exceptionHandling.aMethod(5);
            } catch (Exception e) {
                System.out.println("invalid");
            }
                 exceptionHandling.anotherMethod();
    }


}