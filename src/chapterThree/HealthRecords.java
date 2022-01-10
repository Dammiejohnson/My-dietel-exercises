package chapterThree;

import java.time.LocalDate;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private int height;
    private LocalDate dayOfBirth;
    private double weightInPounds;

    public HealthRecords(String firstName, String lastName, String gender, int day, int month, int year, int height, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        //this.dayOfBirth = dayOfBirth;
        dayOfBirth = LocalDate.of(year,month,day);
        this.weightInPounds = weightInPounds;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDayOfBirth(){
        return dayOfBirth;
    }

    public void setDayOfBirth(int year, int month, int day){
        this.dayOfBirth = LocalDate.of(year, month, day);
    }

    public void setDayOfBirth(LocalDate dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeightInPounds() {
        return weightInPounds * 2.2046;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }



    public int calculateMaximumHeartRate() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - dayOfBirth.getYear();
        int maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    public String getTargetHeartRate() {
        int  maximumHeartRate = calculateMaximumHeartRate();
        double lowerBound = 0.5 * maximumHeartRate;
        double upperBound = 0.85 * maximumHeartRate;
        return String.format("your target heart rate is %.3f - %.3f", lowerBound, upperBound);
    }

    public double getBodyMassIndex() {
        return (weightInPounds * 703) / (height * height);
    }

    public int  getAgeInYears(){
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - dayOfBirth.getYear();
    return age;
    }
}
