package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

        @Test
        public void aGradeCanBeCalculatedTest() {
            Kata kata = new Kata();
            char result = kata.calculateGradeFor(92);
            assertEquals('A', result);
        }
        @Test
        public void bGradeCanBeCalculatedTest(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(89);
        assertEquals('B', result);
         }

         @Test
        public void cGradeCanBeCalculatedTest(){
            Kata kata = new Kata();
            char result = kata.calculateGradeFor(70);
            assertEquals('C', result);
         }
        @Test
        public void dGradeCanBeCalculatedTest(){
            Kata kata = new Kata();
            char result = kata.calculateGradeFor(69);
             assertEquals('D', result);
    }
        @Test
        public void fGradeCanBeCalculatedTest(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(40);
        assertEquals('F', result);
    }

        @Test
        public void for500CopiesAndMore(){
            Kata kata = new Kata();
            int copyNumber = 501;
            int price = kata.calculatePriceFor(copyNumber);
            assertEquals(copyNumber * 1000,price);
        }

    @Test
    public void for200CopiesAndMore(){
        Kata kata = new Kata();
        int copyNumber = 499;
        int price = kata.calculatePriceFor(copyNumber);
        assertEquals(copyNumber * 1100,price);
    }

    @Test
    public void for100CopiesAndMore(){
        Kata kata = new Kata();
        int copyNumber = 199;
        int price = kata.calculatePriceFor(copyNumber);
        assertEquals(copyNumber * 1200,price);
    }

    @Test
    public void for50CopiesAndMore(){
        Kata kata = new Kata();
        int copyNumber = 99;
        int price = kata.calculatePriceFor(copyNumber);
        assertEquals(copyNumber * 1300,price);
    }

    @Test
    public void for30CopiesAndMore(){
        Kata kata = new Kata();
        int copyNumber = 49;
        int price = kata.calculatePriceFor(copyNumber);
        assertEquals(copyNumber * 1500,price);
    }

    @Test
    public void for10CopiesAndMore(){
        Kata kata = new Kata();
        int copyNumber = 29;
        int price = kata.calculatePriceFor(copyNumber);
        assertEquals(copyNumber * 1600,price);
    }

    @Test
    public void for5CopiesAndMore(){
        Kata kata = new Kata();
        int copyNumber = 9;
        int price = kata.calculatePriceFor(copyNumber);
        assertEquals(copyNumber * 1800,price);
    }

    @Test
    public void for1CopiesAndMore(){
        Kata kata = new Kata();
        int copyNumber = 3;
        int price = kata.calculatePriceFor(copyNumber);
        assertEquals(copyNumber * 2000,price);
    }
}
