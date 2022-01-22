package chapterThree;

import java.time.LocalDate;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private double height;
    private LocalDate dayOfBirth;
    private double weightInPound;

    public HealthRecords(String firstName, String lastName, String gender, int day, int month, int year, double height, double weightInPound) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        //this.dayOfBirth = dayOfBirth;
        dayOfBirth = LocalDate.of(year,month,day);
        this.height = height;
        this.weightInPound = weightInPound;

    }

    public String getFirstName() {return firstName;}

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

    //public void setDayOfBirth(LocalDate dayOfBirth){this.dayOfBirth = dayOfBirth;}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeightInPound() {
        return weightInPound * 2.2046;
    }

    public void setWeightInPound(double weightInPound) {
        this.weightInPound = weightInPound;
    }



    public int calculateMaximumHeartRate() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - dayOfBirth.getYear();
        return 220 - age;
    }

    public String getTargetHeartRate() {
        int  maximumHeartRate = calculateMaximumHeartRate();
        double lowerBound = 0.5 * maximumHeartRate;
        double upperBound = 0.85 * maximumHeartRate;
        return String.format("your target heart rate is %.3f - %.3f", lowerBound, upperBound);
    }

    public double getBodyMassIndex() {
        return (weightInPound * 703) / (height * height);
    }

    public int  getAgeInYears(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - dayOfBirth.getYear();
    }
}
