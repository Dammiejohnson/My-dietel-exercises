package CollegeApp;

public enum CollegeType {
    PUBLIC("Government-Fund"), PRIVATE("Self_funding");

    private final String funding;

    CollegeType(String funding){
        this.funding = funding;
    }

    public int getFunding(int amount){
        return amount;
    }
}
