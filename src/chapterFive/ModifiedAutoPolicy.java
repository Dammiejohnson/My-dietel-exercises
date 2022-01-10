package chapterFive;

public class ModifiedAutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == "MA" || state == "NJ" || state == "NY" || state == "PA" || state == "CT" || state == "NH" || state == "ME" || state == "CT"){
            System.out.println("A valid state");
        }
        else System.out.println("You have entered an invalid state!!!");
        this.state = state;
    }

    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA": case "CT": case "NH": case "ME": case "VT":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
        }
        return noFaultState;
    }
}
