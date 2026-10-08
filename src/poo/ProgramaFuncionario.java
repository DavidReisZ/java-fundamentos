package poo;

import java.util.Scanner;
 class ProgramaFuncionario {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario.nomeDaEmpresa = "Latam";
        func1.nome = scanner.nextLine();
        func2.nome = scanner.nextLine();
        func1.salarioBruto = scanner.nextDouble();
        func2.salarioBruto = scanner.nextDouble();
        func1.imposto = scanner.nextDouble();
        func2.imposto = scanner.nextDouble();



         System.out.println("employee: " + func1.nome + ", $ " + func1.salarioLiquido()+ " na Empresa " + func1.nomeDaEmpresa);
         System.out.println("employee: " + func2.nome + ", $ " + func2.salarioLiquido()+ " na Empresa " + func2.nomeDaEmpresa);

         System.out.println("which percentage to increase salary?");
         double percentual = scanner.nextDouble();


        func1.aumentarSalario(percentual);
        func2.aumentarSalario(percentual);

         System.out.println("Updated data: " + func1.nome + ", $ " + func1.salarioLiquido());
         System.out.println("Updated data: " + func2.nome + ", $ " + func2.salarioLiquido());

         scanner.close();
     }

}
