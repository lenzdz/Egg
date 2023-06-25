package ejercicio05_cuentabancaria;

import Entities.BankAccount;
import Services.BankAccountService;
import java.util.Scanner;

public class Ejercicio05_CuentaBancaria {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        BankAccountService bankAccountServ = new BankAccountService();
        
        System.out.println("¡Bienvenido! Primero, cree una cuenta.");
        BankAccount account = bankAccountServ.createAccount();
        
        menu(account);
        
    }
    
    public static void menu(BankAccount account) {
        
        Scanner input = new Scanner(System.in);
        
        BankAccountService bankAccountServ = new BankAccountService();
        
        int choice;
        do {

            System.out.println("\nMENÚ");
            System.out.println("Escoja una de las siguientes opciones:");
            System.out.println("1) Hacer un depósito");
            System.out.println("2) Hacer un retiro");
            System.out.println("3) Hacer una extracción rápida");
            System.out.println("4) Consultar el saldo");
            System.out.println("5) Ver datos de la cuenta");
            System.out.println("6) Salir");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("¿Cuánto depositará a su cuenta?");
                    double dep = input.nextDouble();
                    bankAccountServ.deposit(dep, account);
                    break;
                case 2:
                    System.out.println("¿Cuánto retirará de su cuenta?");
                    double withdraw = input.nextDouble();
                    bankAccountServ.withdraw(withdraw, account);
                    break;
                case 3:
            
                    double percentage;
                    do {
                        System.out.println("Indique el porcentaje del saldo actual que desea retirar (máximo 20%):");
                        percentage = input.nextDouble();
                        if (percentage > 20) {
                            System.out.println("El porcentaje es superior al 20%. Por favor, vuelva a intentarlo.\n");
                        } else if (percentage < 0) {
                            System.out.println("No es posible retirar un monto negativo. Por favor, vuelva a intentarlo.\n");
                        } else {
                            bankAccountServ.expressWithdrawal(percentage, account);
                        }
                    } while (percentage > 20 || percentage < 0);
                    break;
                    
                case 4:
                    bankAccountServ.printBalance(account);
                    break;
                case 5:
                    System.out.println(account);
                    break;
                case 6:
                    System.out.println("¡Gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, vuelva a intentarlo.");
                    break;
            }
 
        } while (choice != 6);
        
    }
    
}
