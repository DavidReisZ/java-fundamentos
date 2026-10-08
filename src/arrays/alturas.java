package arrays;

import java.util.Scanner;
import java.util.Locale;

public class alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int [] idades = new int [n];
        double[] altura = new double[n];


        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da "+ (i+1) +"a pessoa: " );

            System.out.print("Nome: ");
           nome[i] = sc.nextLine();

            System.out.print("Idade: ");
           idades[i] = sc.nextInt();

            System.out.print("Altura: ");
           altura[i] = sc.nextDouble();
           sc.nextLine();


        }
        double soma = 0;

        for (int i = 0; i < n; i++) {

            soma = altura[i] + soma ;
        }
        double media = soma / n;
        System.out.println("Altura media: " + media);

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if(idades[i] < 16){
                contador++;
                System.out.println("Nome: "+ nome[i]);

            }



        }
        double porcentagem = contador * 100.0 / n;

        System.out.println("Pessoas com menos de 16 anos: " + porcentagem+ "%");

        sc.close();


    }



}
