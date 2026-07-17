package ifelse;
import java.util.Scanner;;

public class NegativoPositivo {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int numero;
       System.out.println("Qual o numero");
       numero = sc.nextInt();

    if (numero > 0)
        System.out.println("positivo");

    else if (numero == 0){
        System.out.println("Positivo");

    }else{
        System.out.println("Negativo");
    }
    }
}
