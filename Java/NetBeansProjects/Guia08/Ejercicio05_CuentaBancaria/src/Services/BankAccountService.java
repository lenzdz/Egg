package Services;

import Entities.BankAccount;
import java.util.Scanner;

public class BankAccountService {
    
    private final Scanner input = new Scanner(System.in);
    
    public BankAccount createAccount() {
        
        System.out.println("Ingrese el nuevo número de la cuenta:");
        double accountNumber = input.nextInt();
        
        System.out.println("Ingrese el DNI del usuario:");
        long id = input.nextLong();
        
        System.out.println("Ingrese el balance de la cuenta:");
        double balance = input.nextInt();
        
        return new BankAccount(accountNumber, id, balance);
        
    }
    
    public void printBalance(BankAccount account) {
        System.out.println("Su saldo actual es de " + account.getBalance());
    }

    public void deposit(double dep, BankAccount account) {
        
        double balance = account.getBalance()+dep;
        account.setBalance(balance);
        System.out.println("¡Hecho!");
        
    }
    
    public void withdraw(double withdraw, BankAccount account) {
        
        if (withdraw > account.getBalance()) {
            System.out.println("Su saldo es insuficiente. No es posible realizar la transacción.");
        } else {
            double balance = account.getBalance()-withdraw;
            account.setBalance(balance);
            System.out.println("¡Hecho!");
        }
        
    }
    
    public void expressWithdrawal(double percentage, BankAccount account) {
        
        double toWithdraw = account.getBalance()*(percentage/100);
        double balance = account.getBalance()-toWithdraw;
        account.setBalance(balance);
        System.out.println("¡Hecho!");
        
    }
    
}