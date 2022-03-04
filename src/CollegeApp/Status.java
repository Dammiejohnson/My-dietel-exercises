package CollegeApp;

public enum Status {
    GRADUATE(0), UNDERGRADUATE(3);

    private final int yearsleft;

    Status(int yearsleft){
        this.yearsleft = yearsleft;
    }

    public  int getYearsleft(int years){
        return years;
    }

}
