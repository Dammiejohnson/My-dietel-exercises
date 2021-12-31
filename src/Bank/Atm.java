package Bank;

import java.util.Scanner;

public class Atm {
    public static MyAccount damiAccount;

    public static void main(String[] args) {initialprompt();
    }

    public static void initialprompt() {
        String prompt = """
                Welcome to Catalyst Bank!!!
                Press 1 to create account
                Press any other number to exit
                 """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput == 1) {
            createAccount();
            accountMenu();
        }
        System.exit(0);
    }

    private static void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of Account: ");
        String accountName = input.nextLine();
        System.out.println("Enter account Pin: ");
        String pin = input.nextLine();
        damiAccount = new MyAccount(accountName, pin);
        System.out.println("Your Account Has been created, Welcome to Catalyst Bank");
    }

    private static void accountMenu() {
        do {
            String prompt2 = """
                    Press 1 to deposit
                    Press 2 to withdraw
                    Press 3 to checkBalance
                    Press 4 to go back
                    Press 5 to exit
                    """;

            System.out.println(prompt2);
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();

            if (userInput == 1) {
                System.out.println("Enter Amount to Deposit: ");
                int amount = input.nextInt();
                damiAccount.deposit(amount);
            } else if (userInput == 2) {
                System.out.println("Enter Amount to Withdraw: ");
                int amount = input.nextInt();
                input.nextLine();
                System.out.println("Enter Account Pin: ");
                String pin = input.nextLine();
                damiAccount.withdrawal(amount, pin);
            } else if (userInput == 3) {
                input.nextLine();
                System.out.println("Enter Account Pin to check balance: ");
                String pin = input.nextLine();
                int balance = damiAccount.getBalance(pin);
                System.out.println(balance);
            } else if (userInput == 4) {
                initialprompt();
            } else
                System.exit(0);
        } while (true);
    }
}