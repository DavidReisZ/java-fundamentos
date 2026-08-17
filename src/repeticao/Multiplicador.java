package repeticao;

public class Multiplicador {
    public static void main(String[] args) {

        int numero = 3;

        for (int i = 1; i <= 10 ; i++) {
            int resultado = numero * i;
            System.out.println(numero +" x " + i + " = " +resultado);
        }
    }
}
