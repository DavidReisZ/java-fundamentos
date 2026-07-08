public class operadorImposto {

    public operadorImposto() {
    }
    public static void main(String[] args) {
        float salario = 2800.0F;
        float porcentagem = 70.0F;
        float porcentagemDoSalario = salario * (porcentagem / 100.0F);
        System.out.println(porcentagemDoSalario);
    }
}