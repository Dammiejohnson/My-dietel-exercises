package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static chapterSeven.ArrayNumbers.calculateMaximumLessThanOne;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayNumbersTest {

    public static ArrayNumbers setOfNumbers;

    @BeforeEach
    public void startingPoint(){
        setOfNumbers = new ArrayNumbers();
    }

    @Test
    public void arrayTotalCanBeCalculated (){
        int [] numbers = {1,2,3,4,5};
        int result = setOfNumbers.calculateTotalOf(numbers);
        assertEquals(15, result);
    }

    @Test
    public void arrayMinimumCanBeCalculated (){
        int [] numbers = {1,2,3,4,5};
        int result = setOfNumbers.calculateMinimumOf(numbers);
        assertEquals(1, result);
    }

    @Test
    public void arrayMaximumcCanBeCalculated (){
        int [] numbers = {1,2,3,4,5};
        int result = setOfNumbers.calculateMaximumOf(numbers);
        assertEquals(5, result);
    }

    @Test
    public void arrayAverageCanBeCalculated (){
        int [] numbers = {1,2,3,4,5};
        double result = setOfNumbers.calculateAverageOf(numbers);
        assertEquals(3.0, result);
    }

    @Test
    public void arrayMaximumLessThanOneCanBeCalculated (){
        int [] numbers = {1,2,3,4,5};
        int result = setOfNumbers.calculateMaximumLessThanOne(numbers);
        assertEquals(14, result);
    }

    @Test
    public void arrayMinimumLessThanOneCanBeCalculated (){
        int [] numbers = {1,2,3,4,5};
        int result = setOfNumbers.calculateMinimumLessThanOne(numbers);
        assertEquals(10, result);
    }
}
