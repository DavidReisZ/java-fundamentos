package poo;

public class Account {

   final int numero ;
    String titular;
    double saldo;


    Account(int numero , String titular , double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;

    }
    Account(int numero,String titular){
        this(numero , titular, 0);

    }
    void depositar(double valor){
         saldo = saldo + valor;
    }

    void sacar(double valor){
        saldo =  saldo - valor - 5;

    }
    @Override
    public String toString(){
        return  "Account "+ numero + "," + " Holder: " + titular + "," + " Balance: $ "+ saldo;
    }






}
