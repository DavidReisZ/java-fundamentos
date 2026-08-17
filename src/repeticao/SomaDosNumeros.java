package repeticao;



public class SomaDosNumeros {
    public static void main(String[] args) {

        int soma = 0;

        for(int i=1; i <= 5; i++){
            soma = i + soma;

        }

        System.out.println(soma);
    }
}
