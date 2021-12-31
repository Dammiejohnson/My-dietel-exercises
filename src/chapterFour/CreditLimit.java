package chapterFour;

public class CreditLimit {
    private int accountNumber;
    private int initialBalance;
    private int totalCharges;
    private int totalCredits;
    private  int creditLimit = 1000;

    public CreditLimit (int accountNumber, int initialBalance){
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }

    public int getNewBalance () {
       int newBalance = initialBalance + totalCharges - totalCredits;
       if (newBalance > creditLimit) {
           System.out.println("Credit Limit Exceeded!!!!");
       } else {
           return newBalance;
       }
       return initialBalance;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

//    public void setCreditLimit(int creditLimit) {
//        this.creditLimit = creditLimit;
   // }
}
