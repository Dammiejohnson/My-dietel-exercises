package Bank;

public class MyAccount {
        private String accountName;
        private String pin;
        private int balance = 50_000;

        public MyAccount (String accountName, String pin){
            this.accountName = accountName;
            this.pin = pin;

        }

        public String getAccountName() {return "Sanni Johnson";}

        public int getBalance(String suppliedPin) {
            if (suppliedPin.equals(pin)) return balance;
            return 0;
        }

        public int deposit(int deposit) {
            if (deposit > 0) balance += deposit;
            return balance;
        }

        public void withdrawal(int withdrawal, String pin) {
            if (withdrawal <= balance && withdrawal > 0 && pin.equals(this.pin)) balance -= withdrawal;

        }
    }

