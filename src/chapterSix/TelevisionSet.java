package chapterSix;

public class TelevisionSet {
    private boolean isOn;
    private int volume = 1;
    private int channel = 1;


    public void turnOff() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return  isOn;
    }

    public void increasevolume() {
        if (isOn && volume < 100)
        volume += 1;
    }

    public int getVolume() {
        if (isOn && volume <=100 ) {return volume;}
        return 1;
    }

    public void decreaseVolume() {
        if (isOn && volume > 1)
        volume -= 1;
    }

    public void muteVolume() {
        volume = 0;
    }

    public void increaseChannel() {
        if ((isOn) &&(channel < 20))
        channel+=1;
    }

    public int getChannel() {
        if (isOn && channel <= 20) {return channel;}
        return 1;
    }

    public void decreaaseChannel() {
        if ((isOn) && (channel > 1))
            channel -=1;
    }

    public void setChannel(int channelNumber) {
        if ((isOn) && (channel <=20)) {
            channel = channelNumber;

        }

    }
}
