package variaveis;

public class DescontoCinema {
    public static void main(String[] args) {

        boolean ehEstudante = false;

        int idade = 25;

        boolean temDesconto = ehEstudante || (idade >= 60);

        if (temDesconto) {
            System.out.println("Ganhou o desconto da meia-entrada!");

        } else {
            System.out.println("Paga o valor inteiro.");
        }
    }
}