package chapterSix;

public class JunoAc {
    private String name;
    private boolean isOn;
    private int temperature = 16;

    public JunoAc(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return "thermocool";
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void increaseTemperature() {
        if (temperature < 30 && isOn == true)
        temperature += 1;
        if (isOn==false) temperature =0;
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16 && isOn == true)
        temperature -= 1;
        if (isOn == false) temperature =0;
    }


}
