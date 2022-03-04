package chapterTen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassABTest {

    @Test
    public void instantiateAbstractClassAB(){
        ClassAB classAB = new ClassAB() {
            @Override
            public void wake() {
                System.out.println("I am awake");
            }
        };
    }

}