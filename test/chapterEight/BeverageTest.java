package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {
    @Test
    public void beverageWithNoArgs() {
        Beverage cowbell = new Beverage();
        assertEquals(0, cowbell.getSugarQty());
        assertEquals(0, cowbell.getCocoaQty());
        assertEquals(0, cowbell.getMilkQyt());

    }


}