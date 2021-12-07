package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionSetTest {
    public static TelevisionSet myTv;

    @BeforeEach
    public void startingPoint() {
        myTv = new TelevisionSet();
    }

        @Test
        public void checkThatTvCanBeOff(){
        //given that i have a Tv
            //check that it is off
            myTv.turnOff();
            boolean putTvOn = myTv.isOn();
            assertFalse(putTvOn);
        }

           @Test
           public void checkThatTvCanBeOn(){
            //given that i have a Tv
            // check that it is off
                myTv.turnOff();
                boolean putTvOn = myTv.isOn();
                 assertFalse(putTvOn);

                myTv.turnOn();
                putTvOn = myTv.isOn();
                assertTrue(putTvOn);
                  }

            @Test
            public void volumeCanBeIncreased(){
                // given that i have a Tv
                //when Tv is on
                myTv.turnOn();
                boolean putTvOn = myTv.isOn();
                assertTrue(putTvOn);

                //when i try to increase the volume
                myTv.increasevolume();
                myTv.increasevolume();
                int addVolume = myTv.getVolume();
                assertEquals(3, addVolume);
                }

                @Test
                public void volumeCanBeDecreased(){
                // given that i have a Tv and it is on
                    myTv.turnOn();
                    boolean purTvOn = myTv.isOn();
                    assertTrue(purTvOn);

                    //when i try to decrease the volume by 1 after it has been increased twice
                    myTv.increasevolume();
                    myTv.increasevolume();
                    myTv.decreaseVolume();
                    int removeVolume = myTv.getVolume();
                    assertEquals(2, removeVolume);
                }

                @Test
                public void checkThatTvCanBeMute(){
                    //given that i have a Tv and it is on
                    myTv.turnOn();
                    //check that it can be mute
                    myTv.muteVolume();
                    int offVolume = myTv.getVolume();
                    assertEquals(0, offVolume);
                }

                



}

