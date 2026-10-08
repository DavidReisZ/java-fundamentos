package poo;

public class ProgramaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 4;

        System.out.println("O raio do circulo é de: " + circulo.raio);
        System.out.println("A area é de: " + circulo.calcularArea());
        System.out.println("A circunferencia é de: " + circulo.calcularCircunferencia());
    }
}
