package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JunoAcTest {
    public static JunoAc myAc;

    @BeforeEach
    public void startingPoint(){
        myAc = new JunoAc("thermocool");
    }

    @Test
    public void checkThatAcIsOff(){
        //given that i have an Ac
        //JunoAc myAc = new JunoAc();
        //check that Ac is off
        myAc.turnOff();
        boolean putAcOn = myAc.isOn();
        assertFalse(putAcOn);
    }

    @Test
    public void checkThatAcIsOn(){
       //given that i have an Ac and it is off
       myAc.turnOff();
       boolean putAcOn = myAc.isOn();
       assertFalse(putAcOn);

       //when i put my AC on
        myAc.turnOn();
        putAcOn = myAc.isOn();
        assertTrue(putAcOn);
    }

    @Test
    public void checkThatAcTempeeratureCanBeIncreased (){
        //given that i have an Ac And Ac is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        // when i increase the temperature by 1
        myAc.increaseTemperature();
        // check that temperature is increased by 1
        int currentTemperature = myAc.getTemperature();
        assertEquals(17, currentTemperature);

    }
    @Test
    public void checkThatAcTempeeratureCanBeDecreased (){
        //given that i have an Ac And Ac is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        // when i increase the temperature by 3 and decrease by 1
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.decreaseTemperature();
        // check that temperature is increased by 3 first and then decrease my 1
        int currentTemperature = myAc.getTemperature();
        assertEquals(18, currentTemperature);
    }

    @Test
    public void temperatureCannotGoBelow16(){
        //given that the Ac is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        // when i try to decrease my temperature below 16
        myAc.increaseTemperature();
        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        int currentTemperature = myAc.getTemperature();
        assertEquals(16, currentTemperature);
    }

    @Test
    public void temperatureCannotGoAbove30() {
        //given that the Ac is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        // when i try to increase my temperature above 30
        for (int temp = 0; temp < 15; temp++) {
            myAc.increaseTemperature();
        }
        // check that temperature doesn't go above 30
        int currentTemperature = myAc.getTemperature();
        assertEquals(30, currentTemperature);
    }


    @Test
    public void temperatureCannotGoBelow16AfterIncreasingTo30() {
        //given that the Ac is on
        myAc.turnOn();
        assertTrue(myAc.isOn());
        // when i try to increase my temperature above 30
        for (int temp = 0; temp < 15; temp++) {
            myAc.increaseTemperature();
        }
            for ( int temp = 0; temp < 14 ; temp++){
             myAc.decreaseTemperature();
        }
        // check that temperature doesn't go above 30
        int currentTemperature = myAc.getTemperature();
        assertEquals(16, currentTemperature);
    }

    @Test
    public void checkThatAcTempeeratureCannotBeIncreasedWhenOff (){
        //given that i have an Ac And Ac is off
        myAc.turnOff();
        // when i increase the temperature by 1
        myAc.increaseTemperature();
        // check that temperature  increased by 1
        int currentTemperature = myAc.getTemperature();
        assertEquals(0, currentTemperature);

    }

    @Test
    public void checkThatAcTempeeratureCannotBeDecreasedWhenOff (){
        //given that i have an Ac And Ac is off

        myAc.turnOff();
        assertFalse(myAc.isOn());
        // when i increase the temperature by 2 and decrease by 1

        myAc.decreaseTemperature();
        // check that temperature  increased by 1
        int currentTemperature = myAc.getTemperature();
        assertEquals(0, currentTemperature);

    }


}
