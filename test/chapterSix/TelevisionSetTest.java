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
                                    // when Tv is on
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
                              boolean putTvOn = myTv.isOn();
                              assertTrue(putTvOn);

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

                @Test
                public void channelsCanBeIncreased(){
                    //given that i have a Tv and it is on
                    myTv.turnOn();
                    assertTrue(myTv.isOn());
                    // check that channel can be changed by 1
                     myTv.getChannel();
                    assertEquals(1, myTv.getChannel());
                    myTv.increaseChannel();
                    //channelWhenItIsOn = myTv.getChannel();
                    assertEquals(2,myTv.getChannel());
                }

            @Test
            public void channelsCannotBeIncreasedBeyond20(){
                 //given that i have a Tv and it is on
                    myTv.turnOn();
                    assertTrue(myTv.isOn());
                     // check that channel can be changed by 19
                         myTv.getChannel();
                    assertEquals(1, myTv.getChannel());
                for (int i = 0; i<= 19; i++){
                    myTv.increaseChannel();
                }
                 assertEquals(20,myTv.getChannel());
              }

              @Test
    public void channelsCanBeDecreased(){
        //given that i have a Tv and it is on
        myTv.turnOn();
        assertTrue(myTv.isOn());
        // check that channel can be changed by 2
        myTv.getChannel();
        assertEquals(1, myTv.getChannel());
        myTv.increaseChannel();
        myTv.increaseChannel();
        myTv.increaseChannel();
        myTv.decreaaseChannel();
        assertEquals(3,myTv.getChannel());
    }

    @Test
    public void seTvChannel(){
        //given that it is on and it is on a channel
        myTv.turnOn();
        assertTrue(myTv.isOn());
        //check that tv channel can be set to any number
        myTv.setChannel(20);
        assertEquals(20, myTv.getChannel());

    }


}

