package variaveis;

public class AlturaProBrinquedo {
   public static void main(String[] args) {
        double altura = 1.60;
        int idade = 10;
            boolean podeEntrar = (altura >= 1.50) && (idade >= 12);

            if (podeEntrar){
                System.out.println("Pode andar no brinquedo!");
            }else{
                System.out.println("Nao tem os requisito para entrar.");
            }
    }
}
