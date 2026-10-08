package arrays;


import java.util.Scanner;

public class LeitorN {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Quantos numeros voce vai digitar?");
       int n = sc.nextInt();

       int [] numero = new int [n];
       for (int i = 0; i < n; i++) {
           System.out.println("Digite um numero: ");
           numero[i] = sc.nextInt();


       }
       System.out.println("Numeros negativos: ");
       for (int i = 0; i < n; i++){
           if (numero[i] < 0){
               System.out.println(numero[i]);
           }
       }
       sc.close();
    }
}
