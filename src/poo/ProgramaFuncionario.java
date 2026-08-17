package poo;

import java.util.Scanner;
 class ProgramaFuncionario {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Funcionario meu = new Funcionario();
        meu.nome = scanner.nextLine();
        meu.salarioBruto = scanner.nextDouble();
        meu.imposto = scanner.nextDouble();

         System.out.println("employee: " + meu.nome + ", $ " + meu.salarioLiquido());

         System.out.println("which percentage to increase salary?");
         double percentual = scanner.nextDouble();


         meu.aumentarSalario(percentual);

         System.out.println("Updated data: " + meu.nome + ", $ " + meu.salarioLiquido());

         scanner.close();
     }

}
