package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
        public void bikeCanBeTurnedOff (){
        //given that i have a bike
        Bike bike = new Bike("Sudoku");
        //check that bike can be turned off
        bike.turnoff();
        assertFalse( bike.isOn());
    }

    @Test
        public void bikeCanBeTurnedOn(){
        // given that i have a bike
        Bike bike = new Bike("Sudoku");
        //check that bike can be turned on
        bike.turnOn();
        assertTrue( bike.isOn());
    }

    @Test
        public void bikeCanBeAccelerated(){
        //given that i have a bike and it is on
        Bike bike = new Bike("Sudoku");
        bike.turnOn();
        assertTrue( bike.isOn());
        // check that it can be accelerated
        bike.accelerate(1);
        assertEquals(1,bike.getSpeed());
    }

    @Test
        public void bikeCanBeAcceleratedBy2(){
        //given that i have a bike and it is on
        Bike bike = new Bike("Sudoku");
        bike.turnOn();
        assertTrue( bike.isOn());
        // check that it can be accelerated by two
        bike.accelerate(2);
        assertEquals(2,bike.getSpeed());
    }

    @Test
    public void bikeCanBeAcceleratedBy3(){
        //given that i have a bike and it is on
        Bike bike = new Bike("Sudoku");
        bike.turnOn();
        assertTrue( bike.isOn());
        // check that it can be accelerated by two
        bike.accelerate(3);
        assertEquals(3,bike.getSpeed());
    }

    @Test
    public void bikeCanBeAcceleratedBy4(){
        //given that i have a bike and it is on
        Bike bike = new Bike("Sudoku");
        bike.turnOn();
        assertTrue( bike.isOn());
        // check that it can be accelerated by two
        bike.accelerate(4);
        assertEquals(4,bike.getSpeed());
    }

    @Test
    public void bikeCanBeDeceleratedBy1(){
        //given that i have a bike, it is on and can be accelerated
        Bike bike = new Bike("Sudoku");
        bike.turnOn();
        assertTrue( bike.isOn());
        bike.accelerate(4);
        assertEquals(4,bike.getSpeed());
        // check that it can be decelerated by one
        bike.decelerate(1);
        assertEquals(3,bike.getSpeed());
    }

    @Test
    public void bikeCanBeDeceleratedBy4(){
        //given that i have a bike, it is on and can be accelerated
        Bike bike = new Bike("Sudoku");
        bike.turnOn();
        assertTrue( bike.isOn());
        bike.accelerate(4);
        assertEquals(4,bike.getSpeed());
        // check that it can be decelerated by four
        bike.decelerate(4);
        assertEquals(0,bike.getSpeed());
    }

    @Test
    public void gearCanBeChanged(){
        //given that i have and it is on
        Bike bike = new Bike("Sudoku");
        bike.turnOn();
        assertTrue((bike.isOn()));
        //check that the gear can be changed
        for (int i = 1; i <= 10; i++){
        bike.accelerate(4);}
        assertEquals(40, bike.getSpeed());
        bike.setGear();
        assertEquals(3, bike.getGear());
    }

}
