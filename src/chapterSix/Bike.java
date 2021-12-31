package chapterSix;

public class Bike {
    private String bikeName = "Sudoku";
    private boolean isOn;
    private int speed;
    private int gear;

    public Bike (String bikeName){
        this.bikeName = bikeName;
    }

    public boolean isOn() {
        return  isOn;
    }
    public void turnOn(){
        isOn = true;

    }

    public void turnoff() {
        isOn = false;
    }

    public void accelerate(int gear) {
        if (isOn && gear == 1) speed += 1;
        if (isOn && gear == 2) speed += 2;
        if (isOn && gear == 3) speed += 3;
        if (isOn && gear == 4) speed += 4;
    }

    public int getSpeed() {
        if (speed < 0) { return 0;}
        return  speed;
    }

    public void decelerate(int gear) {
        if (isOn && gear == 1) speed -= 1;
        if (isOn && gear == 2) speed -= 2;
        if (isOn && gear == 3) speed -= 3;
        if (isOn && gear == 4) speed -= 4;
    }

    public void setGear(){
        if (speed > 0 && speed <= 20) gear = 1;
        if (speed > 21 && speed <= 30) gear = 2;
        if (speed > 31 && speed <= 40) gear = 3;
        if (speed >= 41) gear = 4;
    }

    public  int getGear (){
        if(isOn && gear >= 1 && gear <= 4) {return gear;}
        return 0;
    }
}
