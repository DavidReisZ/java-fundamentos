package poo;

import java.util.Scanner;

public class ProgramaConverter {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("What is the dollar price?");
      double cotacao = scanner.nextDouble();

      System.out.println("How many dollars will be bough?");
      double dolares = scanner.nextDouble();




      CurrencyConverter converter = new CurrencyConverter();
      double resultado = converter.calcular(cotacao, dolares);
      System.out.println("Amount to be paid in reais = "+ resultado);


      scanner.close();
  }

}
