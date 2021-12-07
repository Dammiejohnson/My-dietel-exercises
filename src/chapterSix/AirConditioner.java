package chapterSix;

public class AirConditioner {
    private  String name;
    private int temperature = 16;
    private boolean isOn;

    public AirConditioner(String name) {
        this.name = name;
    }

    public String getName() {
        return "Thermocool";
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn(){
        isOn = true;
    }


}
