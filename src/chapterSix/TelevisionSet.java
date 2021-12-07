package chapterSix;

public class TelevisionSet {
    private boolean isOn;
    private int volume = 1;


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
        volume += 1;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        volume -= 1;
    }

    public void muteVolume() {
        volume = 0;
    }
}
