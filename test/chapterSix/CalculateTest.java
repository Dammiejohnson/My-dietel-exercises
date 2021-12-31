package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    @Test
    public void canAddTwoNumbers(){
        //given that
        Calculate calc = new Calculate();
        //when
        int result = calc.canAdd(5, 6);
        assertEquals(11, result);

    }

    @Test
    public void canSubtractTwoNumbers(){
        //given that
        Calculate calc = new Calculate();
        //when
        int result = calc.canSubtract(5, 6);
        assertEquals(-1, result);
    }

    @Test
    public void canMultiplyTwoNumbers(){
        //given that
        Calculate calc = new Calculate();
        //when
        int result = calc.canMultiply(5, -6);
        assertEquals(-30, result);
    }

    @Test
    public void canDivideTwoNumbers(){
        //given that
        Calculate calc = new Calculate();
        //when
        int result = calc.canDivide(9, 3);
        assertEquals(3, result);
    }

    @Test
    public void canModuloTwoNumbers(){
        //given that
        Calculate calc = new Calculate();
        //when
        int result = calc.canModulo(9, 3);
        assertEquals(0, result);
    }

}