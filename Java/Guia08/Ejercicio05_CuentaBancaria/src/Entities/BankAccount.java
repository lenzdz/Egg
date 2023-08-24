package Entities;

public class BankAccount {
    
    private double accountNumber;
    private long id;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double accountNumber, long id, double balance) {
        this.accountNumber = accountNumber;
        this.id = id;
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", id=" + id + ", balance=" + balance + '}';
    }
    
    
    
}
