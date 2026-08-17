package variaveis;

public class CopoAeB {
    public static void main(String[] args) {

        int copoA = 10;
        int  copoB = 20;

        int copoReserva = copoA;
        copoA = copoB;
        copoB = copoReserva;

        System.out.println("copoA: " + copoA);
        System.out.println("copoB: " + copoB);
    }
}
