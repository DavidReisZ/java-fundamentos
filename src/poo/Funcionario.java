package poo;


public class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

    double salarioLiquido(){
        return salarioBruto - imposto;
    }

    void aumentarSalario(double percentual) {
        salarioBruto = salarioBruto + salarioBruto  * percentual / 100;
    }
}
