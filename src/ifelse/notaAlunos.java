package ifelse;

import java.util.Scanner;

public class notaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a nota");


        int nota = sc.nextInt();

                if (nota >= 7) {
                    System.out.println("Aprovado");
                }
                else if (nota >= 5){
                    System.out.println("Recuperaçao");
                }else {
                    System.out.println("Reprovado");
                }


                sc.close();
    }
}
