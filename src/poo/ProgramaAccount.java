package poo;

import java.util.Scanner;

public class ProgramaAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter account holder: ");
        String titular = scanner.nextLine();


        System.out.println("Is there na initial deposit (y/n)?");
        var resposta = scanner.nextLine();

        Account conta;

        if(resposta.equals("y")){
            System.out.println("Enter initial deposit value: " );
            double saldoInicial = scanner.nextDouble();

           conta = new Account(numero , titular , saldoInicial);


        }else {
            conta = new Account(numero, titular);
        }
        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println("Enter a deposit value: ");
        double saldo = scanner.nextDouble();
        conta.depositar(saldo);


        System.out.println("Updated account data:");

        System.out.println(conta);


        System.out.println("Enter a withdraw value: ");
        double saldoUpdated = scanner.nextDouble();
        conta.sacar(saldoUpdated);

        System.out.println("Updated account data:");
        System.out.println(conta);


scanner.close();

    }

}
