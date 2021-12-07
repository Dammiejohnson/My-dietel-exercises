package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    MyAccount djAccount;

    @BeforeEach
            public void startWithThis() {
                djAccount = new MyAccount("Sanni Johnson", "2580");
            }

    @Test
    public void cancreateAccountTest (){
        String nameOfAccount = djAccount.getAccountName();
        assertEquals("Sanni Johnson", nameOfAccount);
    }

    @Test
    public void balanceCanBeGenerated (){
        int balanceOfAccount = djAccount.getBalance("2580");
        assertEquals(50_000, balanceOfAccount);
    }

    @Test
    public void depositCanBeAdded (){
        djAccount.deposit (5000);
        int balanceOfAccount = djAccount.getBalance("2580");
        assertEquals(55_000, balanceOfAccount);
    }

    @Test
    public void negativeDepositCannotBeAdded (){
        djAccount.deposit (-5000);
        int balanceOfAccount = djAccount.getBalance("2580");
        assertEquals(50_000, balanceOfAccount);
    }

    @Test
    public void withdrawalCanBeDone (){
        djAccount.withdrawal(5000, "2580");
        int balanceOfAccount = djAccount.getBalance("2580");
        assertEquals(45_000, balanceOfAccount);
    }

    @Test
    public void negatWithdrawalCannotBeDone (){
        djAccount.withdrawal(-5000, "2580");
        int balanceOfAccount = djAccount.getBalance("2580");
        assertEquals(50_000, balanceOfAccount);
    }

    @Test
    public void withdrawalCannotExceedBalance(){
        djAccount.withdrawal(55_000, "2580");
        int balanceOfAccount = djAccount.getBalance("2580");
        assertEquals(50_000, balanceOfAccount);
    }

    @Test
    public void withdrawalReturnsZeroForWrongPin(){
        djAccount.withdrawal(45_000, "2581");
        int balanceOfAccount = djAccount.getBalance("2580");
        assertEquals(50_000, balanceOfAccount);
    }

}