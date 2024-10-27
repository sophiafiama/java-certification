package exercises.o1;

import java.time.LocalDate;

public class Account {

    public int numberAccount;
    public int numberAgency;
    public String nameClient;
    public LocalDate birthDate;
    public double balance;
    public boolean active = true;

    public Account(int numberAccount, int numberAgency, String nameClient, LocalDate birthDate, double balance) {
        this.numberAccount = numberAccount;
        this.numberAgency = numberAgency;
        this.nameClient = nameClient;
        this.birthDate = birthDate;
        this.balance = balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getNumberAgency() {
        return numberAgency;
    }

    public void setNumberAgency(int numberAgency) {
        this.numberAgency = numberAgency;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public void transfer(Account account, double value) {
        this.withdraw(value);
        account.deposit(value);
    }

    private void deposit(double value) {
        this.balance += value;
    }

    public String cancel() {
        if (this.balance > 0) {
            return "You can't cancel, account with balance";
        } else {
            this.active = false;
            return "Account canceled";
        }

    }

    public String checkBalance() {
        return "Balance: " + this.balance;
    }

    public static void main(String[] args) {
        Account account1 = new Account(001,
                456,
                "John Doe",
                LocalDate.of(1990, 1, 1),
                1000);

        Account account2 = new Account(002,
                456,
                "Jane Doe",
                LocalDate.of(1990, 1, 1)
                , 2000);

        // Transfer 500 from account1 to account2

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        System.out.println("Transfering 500 from account 1 to account 2");
        account1.transfer(account2, 500);
        System.out.println("New balance account 1: " + account1.getBalance());
        System.out.println("New balance account 2: " + account2.getBalance());

        System.out.println("status account 1: " + account1.isActive());
        System.out.println("status account 2: " + account2.isActive());

        System.out.println("Canceling account 1");
        System.out.println(account1.cancel());
        System.out.println("Transfering balance from account 1 to account 2");
        account1.transfer(account2, account1.getBalance());
        System.out.println("status account 1: " + account1.isActive());
        System.out.println("Canceling account 1");
        System.out.println(account1.cancel());

    }
}
