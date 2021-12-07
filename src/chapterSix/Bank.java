package chapterSix;

public class Bank {
    public static void main(String[] args) {
        Account increaseAccount = new Account("Incrase Lois");
        Account mjAccount = new Account("Mary Jane");

        System.out.println("Increase account balance is: " + increaseAccount.checkBalance());
        System.out.println("Mj account balance is: " + mjAccount.checkBalance());

        increaseAccount.setAccountName("i++");
    }
}
